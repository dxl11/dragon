package com.dxl.mg.ES;

import org.apache.commons.collections4.CollectionUtils;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.elasticsearch.search.sort.ScoreSortBuilder;
import org.elasticsearch.search.sort.SortOrder;
import org.elasticsearch.search.suggest.SuggestBuilder;
import org.elasticsearch.search.suggest.completion.CompletionSuggestion;
import org.elasticsearch.search.suggest.completion.CompletionSuggestionBuilder;

import java.util.ArrayList;
import java.util.List;

public class AutoSuggest {
    /**
     * 自动补全，根据用户得输入联想到可能得词语或者短语
     * 1.定义远程查询
     * 2.定义查询请求
     * 3.定义自动完成构建器
     * 4.将自动完成构建器加入到查询构建器
     * 5.将查询构建器加入到查询请求
     * 6.获取自动建议得值（数据结构处理）
     *
     */
    public static List<String> cSuggest(CommonEntity commonEntity) throws Exception{
        //定义返回
        List<String> suggestList = new ArrayList<>();
        //构建请求查询
        SearchRequest searchRequest = new SearchRequest(commonEntity.getIndexName());
        //通过查询构建器定义评分排序
        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
        searchSourceBuilder.sort(new ScoreSortBuilder().order(SortOrder.DESC));
        //构建搜索建议语句，搜索条件字段
        CompletionSuggestionBuilder completionSuggestionBuilder = new CompletionSuggestionBuilder(commonEntity.getSuggestFileld());
        //搜索关键字
        completionSuggestionBuilder.prefix(commonEntity.getSuggestValue());
        //去除重复
        completionSuggestionBuilder.skipDuplicates(true);
        //匹配数量
        completionSuggestionBuilder.size(commonEntity.getSuggestCount());
        searchSourceBuilder.suggest(new SuggestBuilder().addSuggestion("common-suggest", completionSuggestionBuilder));
        //common-suggest为返回的字段，所有返回将在common-suggest里面，可写死,sort按照评分排序
        searchRequest.source(searchSourceBuilder);
        //定义查找响应
        SearchResponse suggestResponse = ElasticSearchConfig.highLevelClient().search(searchRequest, RequestOptions.DEFAULT);
        //定义完成建议对象
        CompletionSuggestion completionSuggestion = suggestResponse.getSuggest().getSuggestion("common-suggest");
        List<CompletionSuggestion.Entry.Option> optionsList = completionSuggestion.getEntries().get(0).getOptions();
        //从optionsList取出结果
        if (!CollectionUtils.isEmpty(optionsList)) {
            optionsList.forEach(item -> suggestList.add(item.getText().toString()));
        }
        return suggestList;

    }

    public static void main(String[] args) throws Exception {
        // 自动补全
        CommonEntity suggestEntity = new CommonEntity();
        suggestEntity.setIndexName("product_completion_index"); // 索引名
        suggestEntity.setSuggestFileld("searchkey"); // 自动补全查找列
        suggestEntity.setSuggestValue("小米"); //  自动补全输入的关键字
        suggestEntity.setSuggestCount(10); // 自动补全返回个数

        System.out.println(cSuggest(suggestEntity));
        // 结果：[小米11, 小米9, 小米手机, 小米手环, 小米摄像头]
        // 自动补全自动去重
    }
}
