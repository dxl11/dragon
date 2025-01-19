package com.dxl.mg.ES;


import org.apache.http.HttpHost;

import org.apache.http.client.config.RequestConfig;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ElasticSearchConfig {

    private final static String cluster_host = "127.0.0.1";
    private final static Integer eNode3_port = 9200;

    /**
     * 设置超时时间
     *
     * @return
     */
    private static final int TIME_OUT = 5 * 60 * 1000;
    private static final RestHighLevelClient client = highLevelClient();

    private static RestClientBuilder restClientBuilder() {
        return RestClient.builder( // 可以传多个作为集群
                new HttpHost(cluster_host, eNode3_port, "http"));

    }

    /**
     * 获取客户端
     */
    public static RestHighLevelClient highLevelClient() {
        RestClientBuilder restClientBuilder = restClientBuilder();
        restClientBuilder.setRequestConfigCallback(
                new RestClientBuilder.RequestConfigCallback() {
                    @Override
                    public RequestConfig.Builder customizeRequestConfig(
                            RequestConfig.Builder requestConfigBuilder) {
                        return requestConfigBuilder.setSocketTimeout(TIME_OUT);
                    }
                });

        return new RestHighLevelClient(restClientBuilder);
    }
}
