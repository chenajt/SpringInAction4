package com.silence.forest.FitBen;

/**
 * 舞台 @modificationHistory.
 * <ul>
 * <li>clb 2017年8月4日下午3:36:05 TODO</li>
 * </ul>
 */
public class Stage {
	public Stage() {
	}
	//静态内部类
	public static class StageSingletoHolder{
		static Stage instance = new Stage();
	}
	public static Stage getInstance(){
		return StageSingletoHolder.instance;
	}
}
