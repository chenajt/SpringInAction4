package com.silence.forest.knights;

/**
 * 吟游诗人，作为骑士的一个切面
 * 
 * @modificationHistory.  
 * <ul>
 * <li>clb 2017年8月4日下午1:42:39 TODO</li>
 * </ul>
 */
public class Minstrel {
	public void singBeforeQuest(){
		System.out.println("Fa la la;The knight is so brave!");
	}
	public void singAfterQuest(){
		System.out.println("Tee me me;The brave knight has fineshed task!");
	}
}
