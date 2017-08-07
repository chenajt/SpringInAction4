package com.silence.forest.springAop;

/**
 * 明智的读者
 * @modificationHistory.  
 * <ul>
 * <li>clb 2017年8月7日下午2:44:58 TODO</li>
 * </ul> 
 */
public interface MindReader {
	void interceptThoughts(String thoughts);
	String getThoughts();
}
