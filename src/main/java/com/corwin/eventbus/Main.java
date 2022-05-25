package com.corwin.eventbus;

import com.google.common.eventbus.EventBus;

/**
 * @Author Sbaby
 * @Date 2022/5/24 23:26
 * @Version 1.0
 */
public class Main {

	public static void main(String[] args) {
		// 创建事件总线
		EventBus bus = new EventBus("test");
		// 创建一个监听者
		EventListener listener = new EventListener();
		// 注册监听者
		bus.register(listener);
		// 向事件总线发送消息
		bus.post(new Message("This is a message!"));
	}
}
