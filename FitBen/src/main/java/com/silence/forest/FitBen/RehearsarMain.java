package com.silence.forest.FitBen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 排练 @modificationHistory.
 * <ul>
 * <li>clb 2017年8月4日下午2:57:15 TODO</li>
 * </ul>
 */
public class RehearsarMain {
	public static void main(String[] args) throws PerformanceException {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-fitbean.xml");
		Performer performer = (Performer) context.getBean("ricky");
		performer.perform();
	}
}
