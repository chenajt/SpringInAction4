package com.silence.forest.springAop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IntMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-aop-introductions.xml");
		Contestant performer = (Contestant) context.getBean("eddie");
		performer.receiveAward();
	}
}
