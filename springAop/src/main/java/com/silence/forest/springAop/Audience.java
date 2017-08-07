package com.silence.forest.springAop;

/**
 * 表演
 * @modificationHistory.  
 * <ul>
 * <li>clb 2017年8月7日下午2:04:45 TODO</li>
 * </ul> 
 */
public class Audience {
	//表演前入座
	public void takeSeats(){
		System.out.println("The audience is taking their seats.");
	}

	//表演前关机
	public void turnOffCellPhones(){
		System.out.println("The audience is turning off their cellPhones.");
	}
	
	//表演之后鼓掌
	public void applaud(){
		System.out.println("clap clap clap");
	}
	
	//表演失败之后
	public void demandRefund(){
		System.out.println("Boo! We want our money back");
	}
}
