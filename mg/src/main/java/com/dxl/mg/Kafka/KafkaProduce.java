package com.dxl.mg.Kafka;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.apache.kafka.common.errors.*;
import org.apache.kafka.common.utils.Utils;

import java.util.concurrent.ExecutionException;

public class KafkaProduce {
    public static void main(String[] args) {
        //topic名称
        String topicName = "kafka-study";
        //broker列表
        String bootstrapServers = "cdh1:9092,cdh2:9092,cdh3:9092";
        //向topic打多少数据
        int numRecords = 10000;
        //是否推送异步数据
        boolean isAsync = true;
        int key = 0;
        int sentRecords = 0;
    }
}
