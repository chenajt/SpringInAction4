package com.silence.forest.FitBen;

/**
 * 变戏法的人，魔术师
 * @modificationHistory.  
 * <ul>
 * <li>clb 2017年8月4日下午2:43:33 TODO</li>
 * </ul> 
 */
public class Juggler implements Performer{
	private int beanBags = 3;
	public Juggler(){
	}
	public Juggler(int beanBags){
		this.beanBags = beanBags;
	}
	public void perform() throws PerformanceException {
		System.out.println("Juggling "+beanBags+" beanBags");
	}
	
}
