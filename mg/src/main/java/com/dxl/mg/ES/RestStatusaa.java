package com.dxl.mg.ES;

import org.elasticsearch.action.bulk.BulkRequest;
import org.elasticsearch.action.bulk.BulkResponse;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.rest.RestStatus;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RestStatusaa {
    public static RestStatus bulkAddDoc(CommonEntity commonEntity) throws IOException {
        //通过索引创建批量请求对象
        BulkRequest bulkRequest = new BulkRequest(commonEntity.getIndexName());
        //循环前台List文档数据
        for (int i = 0; i < commonEntity.getList().size(); i++) {
            bulkRequest.add(new IndexRequest().source(XContentType.JSON, SearchTools.mapToObjectGroup(commonEntity.getList().get(i))));
        }
        //批量执行
        BulkResponse bulkItemResponses = ElasticSearchConfig.highLevelClient().bulk(bulkRequest, RequestOptions.DEFAULT);
        return bulkItemResponses.status();

    }

//    public static void main(String[] args) throws IOException {
//        CommonEntity commonEntity = new CommonEntity();
//        commonEntity.setIndexName("product"); // 索引名
//        List<Map<String, Object>> list = new ArrayList<>();
//        commonEntity.setList(list);
//        list.add(new CommonMap<String, Object>().putData("name", "小米（MI）10手机全面屏").putData("price", 2233.8));
//        list.add(new CommonMap<String, Object>().putData("name", "小米（MI）11手机划超酷炫").putData("price", 13123));
//        list.add(new CommonMap<String, Object>().putData("name", "小米（MI）电脑大da屏").putData("price", 213));
//        list.add(new CommonMap<String, Object>().putData("name", "华为手机全面屏大").putData("price", 342));
//        list.add(new CommonMap<String, Object>().putData("name", "华为手机大屏大").putData("price", 1234));
//        list.add(new CommonMap<String, Object>().putData("name", "华为电脑全面屏大奥利给").putData("price", 345));
//        list.add(new CommonMap<String, Object>().putData("name", "华为平板电脑全面屏大奥利给").putData("price", 1234));
//        list.add(new CommonMap<String, Object>().putData("name", "荣耀小米手机").putData("price", 45234));
//        list.add(new CommonMap<String, Object>().putData("name", "手机平板全面屏").putData("price", 4532));
//        bulkAddDoc(commonEntity);
//    }
//public static void main(String[] args) throws Exception {
//    // 批量插入
//    CommonEntity commonEntity = new CommonEntity();
//    commonEntity.setIndexName("product_completion_index"); // 索引名
//    List<Map<String, Object>> list = new ArrayList<>();
//    commonEntity.setList(list);
//    list.add(new CommonMap<String, Object>().putData("searchkey", "小米手机").putData("name", "小米(MI)"));
//    list.add(new CommonMap<String, Object>().putData("searchkey", "小米11").putData("name", "小米(MI)"));
//    list.add(new CommonMap<String, Object>().putData("searchkey", "小米电视").putData("name", "小米(MI)"));
//    list.add(new CommonMap<String, Object>().putData("searchkey", "小米9").putData("name", "小米(MI)"));
//    list.add(new CommonMap<String, Object>().putData("searchkey", "小米手机").putData("name", "小米(MI)"));
//    list.add(new CommonMap<String, Object>().putData("searchkey", "小米手环").putData("name", "小米(MI)"));
//    list.add(new CommonMap<String, Object>().putData("searchkey", "小米笔记本").putData("name", "小米(MI)"));
//    list.add(new CommonMap<String, Object>().putData("searchkey", "小米摄像头").putData("name", "小米(MI)"));
//    list.add(new CommonMap<String, Object>().putData("searchkey", "adidas男鞋").putData("name", "adidas男鞋"));
//    list.add(new CommonMap<String, Object>().putData("searchkey", "adidas女鞋").putData("name", "adidas女鞋"));
//    list.add(new CommonMap<String, Object>().putData("searchkey", "adidas外套").putData("name", "adidas外套"));
//    list.add(new CommonMap<String, Object>().putData("searchkey", "adidas裤子").putData("name", "adidas裤子"));
//    bulkAddDoc(commonEntity);
//}
public static void main(String[] args) throws Exception {
    // 批量插入
    CommonEntity commonEntity = new CommonEntity();
    commonEntity.setIndexName("product_completion_index"); // 索引名
    List<Map<String, Object>> list = new ArrayList<>();
    commonEntity.setList(list);
    list.add(new CommonMap<String, Object>().putData("searchkey", "阿迪达斯袜子").putData("name", "阿迪达斯袜子"));
    list.add(new CommonMap<String, Object>().putData("searchkey", "阿迪达斯外套").putData("name", "阿迪达斯外套"));
    list.add(new CommonMap<String, Object>().putData("searchkey", "阿迪达斯运动鞋").putData("name", "阿迪达斯运动鞋"));
    list.add(new CommonMap<String, Object>().putData("searchkey", "耐克运动鞋").putData("name", "耐克运动鞋"));
    list.add(new CommonMap<String, Object>().putData("searchkey", "耐克运动鞋").putData("name", "耐克运动鞋"));
    list.add(new CommonMap<String, Object>().putData("searchkey", "耐克运动鞋").putData("name", "耐克运动鞋"));
    bulkAddDoc(commonEntity);
}
}
