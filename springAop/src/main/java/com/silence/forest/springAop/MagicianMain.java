package com.silence.forest.springAop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MagicianMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-magician.xml");
		Thinker volunteer = (Thinker) context.getBean("volunteer");
		volunteer.thinkOfSomething("I want to play baskball,en");
	}
}
