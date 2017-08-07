package com.silence.forest.springAop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @modificationHistory.  
 * <ul>
 * <li>clb 2017年8月7日下午3:08:54 TODO</li>
 * </ul> 
 */
public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-around.xml");
		Performer performer = (Performer) context.getBean("eddie");
		try{
			performer.perform();
		}catch(PerformanceException e){
			e.printStackTrace();
		}
	}
}
