package com.silence.forest.FitBen;

public class SongBook {
	private String [] sonTitles;
	public SongBook(String [] songTitles) {
		this.sonTitles = songTitles;
	}
	public String pickASong(){
		return sonTitles[0];
	}
}
