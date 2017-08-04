package com.silence.forest.knights;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @modificationHistory.  
 * <ul>
 * <li>clb 2017年8月4日下午12:35:22 TODO</li>
 * </ul> 
 */
public class KnightAopMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("knights-aop.xml");
		Knight knight = (Knight) context.getBean("knight");
		knight.embarkQuest();
		Knight knight1 = (Knight) context.getBean("damselresuingknight");
		knight1.embarkQuest();
	}
}
