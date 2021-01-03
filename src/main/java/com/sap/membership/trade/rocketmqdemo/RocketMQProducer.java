package com.sap.membership.trade.rocketmqdemo;

import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.client.producer.SendStatus;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.common.RemotingHelper;

import java.util.concurrent.TimeUnit;

public class RocketMQProducer {

    public static void main(String[] args) throws Exception {
        // step 1: 创建一个消息生产者，默认使用topic模式，一个默认的topic会产生4个队列，发送的消息会分别存在这4个队列中
        DefaultMQProducer producer = new DefaultMQProducer("default-producer");
        //producer.setSendMsgTimeout(6000);
        // step 2: set nameserver address
        producer.setNamesrvAddr("127.0.0.1:9876");
        // set producer instance name my_producer_1
        producer.setInstanceName("my_producer_1");
        // set retry time 3 seconds when send failed
        producer.setRetryTimesWhenSendFailed(3);
        // set vip channel false
        producer.setVipChannelEnabled(false);
        // step 3: producer start
        producer.start();

        for (int i = 0; i < 10; i++) {
            Message message = new Message("topic_default", "tag_a", "message body contents".getBytes(RemotingHelper.DEFAULT_CHARSET));
            SendResult sendResult = producer.send(message);
            System.out.println(sendResult);
            String msgId = sendResult.getMsgId();
            SendStatus sendStatus = sendResult.getSendStatus();
            int queueId = sendResult.getMessageQueue().getQueueId();
            System.out.println("send status:"+sendStatus+",message id:"+msgId + ",queue id:"+queueId);
            TimeUnit.SECONDS.sleep(1);
        }

        // 4 producer shutdown
        producer.shutdown();
    }
}
