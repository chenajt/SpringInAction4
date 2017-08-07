package com.silence.forest.advancedFit;

/**
 * 歌手
 * @modificationHistory.  
 * <ul>
 * <li>clb 2017年8月7日下午1:36:07 TODO</li>
 * </ul> 
 */
public class Song {
	private final String title;
	private final String composer;
	private final String lyrics;

	public Song(String title, String composer, String lyrics) {
		super();
		this.title = title;
		this.composer = composer;
		this.lyrics = lyrics;
	}

	public String getTitle() {
		return title;
	}

	public String getComposer() {
		return composer;
	}

	public String getLyrics() {
		return lyrics;
	}

}
