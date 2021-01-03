package com.sap.membership.trade.rocketmqdemo;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.common.message.MessageExt;
import org.apache.rocketmq.common.protocol.heartbeat.MessageModel;

public class RocketMQConsumer {

    public static void main(String[] args) throws Exception {
        // 实例化消息消费者
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer("myGroup001");
        // 指定NameServer
        consumer.setNamesrvAddr("127.0.0.1:9876");
        // 订阅topic
        consumer.subscribe("topic_default", "*");
        // 负债均衡模式消费
        consumer.setMessageModel(MessageModel.CLUSTERING);
        // 设置消息监听器
        consumer.setMessageListener((MessageListenerConcurrently) (msgs, context) -> {
            for (MessageExt msg : msgs){
                System.out.println(new String(msg.getBody()));
            }
            return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
        });

        // 启动Consumer
        consumer.start();
        System.out.println("消费者启动");
    }

}
