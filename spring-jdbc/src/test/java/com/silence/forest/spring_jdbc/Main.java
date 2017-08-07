package com.silence.forest.spring_jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("dataSource-context.xml");
		JdbcSpitterDao dao = (JdbcSpitterDao)context.getBean("jdbcSpitterDao");
		Spitter s = new Spitter();
		s.setFullName("jiechen");
		s.setUserName("chenj");
		s.setEmail("32615421@qq.com");
		s.setPassword("123456");
		dao.addSpitter(s);
		Spitter spitter = dao.getSpitterById(1);
		System.out.println(spitter.getUserName());
	}

}
