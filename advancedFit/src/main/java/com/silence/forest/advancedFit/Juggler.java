package com.silence.forest.advancedFit;

/**
 * 魔术师
 * @modificationHistory.  
 * <ul>
 * <li>clb 2017年8月7日上午11:42:43 TODO</li>
 * </ul> 
 */
public class Juggler implements Performer{
	private int beanBags = 3;
	public Juggler() {
	}
	
	public Juggler(int beanBags) {
		this.beanBags = beanBags;
	}

	public void perform() throws PerformanceException {
		System.out.println("juggling "+beanBags + " beanBags");
	}

}
