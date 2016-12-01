package com.zeus.common.jms.consumer;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.springframework.stereotype.Component;

@Component
public class Consumer implements MessageListener {

	public void onMessage(Message message) {
		TextMessage textMsg = (TextMessage) message;
		try {
			System.out.println("消息内容是：" + textMsg.getText());
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}

}