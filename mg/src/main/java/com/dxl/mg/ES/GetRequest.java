package com.dxl.mg.ES;

import com.alibaba.fastjson.JSON;
import org.apache.commons.lang3.StringUtils;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.builder.SearchSourceBuilder;

import java.util.Map;

public class GetRequest {

    /**
     * 全文检索
     * 使用matchQuery在执行查询得时候，搜索得词会被分词器分词
     * 1.构建远程查询
     * 2.构建查询请求
     * 3.构建查询条件
     * 4.设置高亮
     * 5.设置分页
     * 6.处理高亮
     */
    public static SearchResponse matchQuery(CommonEntity commonEntity) throws Exception {
        //构建查询响应
        SearchResponse response = null;
        //构建查询请求用来完成和搜索文档，聚合，建议等相关得任何操作同时也提供了各种方式来完成对应结果得高亮操作
        SearchRequest searchRequest = new SearchRequest(commonEntity.getIndexName());
        //构建DSL请求体;trackTotalHits如果不设置true，查询数据最大值还是10000
        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder().trackTotalHits(true);
        //获取前端得查询条件
        getClientConditions(commonEntity,searchSourceBuilder);
        //高亮设置
        searchSourceBuilder.highlighter(SearchTools.getHighlightBuilder(commonEntity.getHighlight()));
        //前端页码
        int pageNumber = commonEntity.getPageNumber();
        //前端每页数量
        int pageSize = commonEntity.getPageSize();
        //计算查询的下标，从0开始
        int dest = (pageNumber - 1) * pageSize;
        searchSourceBuilder.from(dest);
        //每页数量
        searchSourceBuilder.size(pageSize);
        //查询条件对象放入请求对象中
        searchRequest.source(searchSourceBuilder);
        //方法执行开始时间
        long startTime = System.currentTimeMillis();
        System.out.println("开始Elasticsearch查询...");
        //执行远程查询,使用RequestOptions.DEFAULT用来构建一个默认缓冲区限制为100MB（源码为DEFAULT_BUFFER_LIMIT = 100 * 1024 * 1024），和header为空、WarningsHandler为空
        //的参数选项
        response = ElasticSearchConfig.highLevelClient().search(searchRequest, RequestOptions.DEFAULT);
        //计算远程查询耗时
        System.out.println("结束Elasticsearch查询总耗时:" + (System.currentTimeMillis() - startTime) + "毫秒");
        //处理高亮
        SearchTools.setHighResultForCleintUI(response, commonEntity.getHighlight());
        return response;
    }

    /**
     * 获取前端得查询条件
     */
    private static void getClientConditions(CommonEntity commonEntity, SearchSourceBuilder searchSourceBuilder) {
        //循环前端得查询条件
        for (Map.Entry<String, Object> m : commonEntity.getMap().entrySet()) {
            if (StringUtils.isNoneEmpty(m.getKey()) && m.getValue() != null) {
                String key = m.getKey();
                String value = String.valueOf(m.getValue());
                //构造请求体中“query”:{}部分的内容 ,QueryBuilders静态工厂类，方便构造queryBuilder
                //将搜索词分词，再与目标查询字段进行匹配，若分词中的任意一个词与目标字段匹配上，则可查询到。
                searchSourceBuilder.query(QueryBuilders.matchQuery(key, value));
                System.out.println(("search for the keyword:" + value));
            }
        }
    }

    public static void main(String[] args) throws Exception {
        //全文检索
        CommonEntity queryEntity = new CommonEntity();
        queryEntity.setPageNumber(1);// 第一页
        queryEntity.setPageSize(5); // 一页条数
        queryEntity.setIndexName("product"); // 索引名
        queryEntity.setHighlight("name"); // 高亮字段
        queryEntity.setMap(new CommonMap<>().putData("name", "华为全面屏")); // 要查询的字段 + 内容
        SearchResponse searchResponse = matchQuery(queryEntity);
        long aSize = searchResponse.getHits().getTotalHits().value;
        System.out.println(("数据总数量为>>>" + aSize));
        long cSize = searchResponse.getHits().getHits().length;
        System.out.println(("本次获取数据量为>>>" + cSize));
        System.out.println("内容为>>>" + JSON.toJSONString(searchResponse.getHits().getHits()));
        System.out.println("全部内容>>>" + JSON.toJSON(searchResponse));
    }


}