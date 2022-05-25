package com.corwin.springlistener.applicationrunner;

import com.corwin.springlistener.SpringlistenerApplication;
import com.corwin.springlistener.annotations.Counter;
import javafx.application.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @Author Sbaby
 * @Date 2022/5/25 0:14
 * @Version 1.0
 */
@Component
public class CounterApplicationRunner implements ApplicationRunner {
	@Autowired
	private ApplicationContext applicationContext;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		for (String beanDefinitionName : beanDefinitionNames) {
			Object bean = applicationContext.getBean(beanDefinitionName);
			Method[] declaredMethods = bean.getClass().getDeclaredMethods();
			for (Method declaredMethod : declaredMethods) {
				if(declaredMethod.isAnnotationPresent(Counter.class)) {
					System.out.println(declaredMethod.getName());
				}
			}
		}
	}
}
