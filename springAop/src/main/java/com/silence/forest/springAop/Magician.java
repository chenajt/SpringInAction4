package com.silence.forest.springAop;

/**
 * 魔术师
 * @modificationHistory.  
 * <ul>
 * <li>clb 2017年8月7日下午2:48:04 TODO</li>
 * </ul> 
 */
public class Magician implements MindReader{
	private String thoughts;

	public void interceptThoughts(String thoughts) {
		System.out.println("Intercepting volunteer's thoughts");
		this.thoughts = thoughts;
	}

	public String getThoughts() {
		return thoughts;
	}

}
