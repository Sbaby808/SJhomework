package com.corwin.eventbus;

import com.google.common.eventbus.Subscribe;

/**
 * @Author Sbaby
 * @Date 2022/5/24 23:42
 * @Version 1.0
 */
public class EventListener {

	@Subscribe
	public void printMessage(Message message) {
		System.out.println(message.getMessage());
	}

}
