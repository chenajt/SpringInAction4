package com.silence.forest.springAop;

/**
 * 志愿者
 * @modificationHistory.  
 * <ul>
 * <li>clb 2017年8月7日下午2:55:14 TODO</li>
 * </ul> 
 */
public class Volunteer implements Thinker{
	private String thoughts;
	
	public void thinkOfSomething(String thoughts) {
		this.thoughts = thoughts;
	}

	public String getThoughts() {
		return thoughts;
	}

}
