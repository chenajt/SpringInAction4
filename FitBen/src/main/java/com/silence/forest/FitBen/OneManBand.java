package com.silence.forest.FitBen;

import java.util.Collection;

/**
 * 一人乐队 演示集合的装配 @modificationHistory.
 * <ul>
 * <li>clb 2017年8月4日下午2:47:25 TODO</li>
 * </ul>
 */
public class OneManBand implements Performer {
	private Collection<Instrument> instruments;

	public OneManBand() {
	}

	public void perform() throws PerformanceException {
		for (Instrument instrument : instruments) {
			instrument.play();
		}
	}

	public void setInstruments(Collection<Instrument> instruments) {
		this.instruments = instruments;
	}
}
