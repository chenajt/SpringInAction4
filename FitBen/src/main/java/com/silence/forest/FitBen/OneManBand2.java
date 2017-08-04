package com.silence.forest.FitBen;

import java.util.Map;

/**
 * 
 * @modificationHistory.  
 * <ul>
 * <li>clb 2017年8月4日下午3:47:51 TODO</li>
 * </ul> 
 */
public class OneManBand2 implements Performer{
	private Map<String,Instrument> instruments;
	
	public OneManBand2() {
	}
	
	public void perform() throws PerformanceException {
		for(String key:instruments.keySet()){
			System.out.println(key+":");
			Instrument instrument = instruments.get(key);
			instrument.play();
		}
	}

	public void setInstruments(Map<String, Instrument> instruments) {
		this.instruments = instruments;
	}

}
