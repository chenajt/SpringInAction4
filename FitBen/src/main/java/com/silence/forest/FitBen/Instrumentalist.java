package com.silence.forest.FitBen;

/**
 * 音乐演奏家，演示setter注入
 * @modificationHistory.  
 * <ul>
 * <li>clb 2017年8月4日下午2:35:24 TODO</li>
 * </ul> 
 */
public class Instrumentalist implements Performer{
	private String song;
	private Instrument instrument;
	public Instrumentalist(){
	}
	public void perform() throws PerformanceException {
		System.out.println("Playing "+song+":");
		instrument.play();
	}
	public String getSong() {
		return song;
	}
	public void setSong(String song) {
		this.song = song;
	}
	//唱歌
	public String screamSong(){
		return song;
	}
	public Instrument getInstrument() {
		return instrument;
	}
	//注入
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}
	
}
