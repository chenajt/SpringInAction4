package com.silence.forest.FitBen;

/**
 * 
 * @modificationHistory.  
 * <ul>
 * <li>clb 2017年8月4日下午3:55:13 TODO</li>
 * </ul> 
 */
public class Song {
	//歌名
	private final String title;
	//作词人
	private final String composer;
	//高潮部分
	private final String lyrices;
	
	public Song(String title, String composer, String lyrices) {
		this.title = title;
		this.composer = composer;
		this.lyrices = lyrices;
	}

	public String getTitle() {
		return title;
	}

	public String getComposer() {
		return composer;
	}

	public String getLyrices() {
		return lyrices;
	}
	
}
