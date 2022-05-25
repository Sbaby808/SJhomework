package com.corwin.springlistener.beans;

import com.corwin.springlistener.annotations.Counter;
import org.springframework.stereotype.Component;

/**
 * @Author Sbaby
 * @Date 2022/5/25 0:10
 * @Version 1.0
 */
@Component
public class SomeBean {

	@Counter
	public void doSomething() {
		System.out.println("do something...");
	}

}
