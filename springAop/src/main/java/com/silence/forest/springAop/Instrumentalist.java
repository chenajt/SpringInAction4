package com.silence.forest.springAop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * 演奏者
 * @modificationHistory.  
 * <ul>
 * <li>clb 2017年8月7日上午11:35:09 TODO</li>
 * </ul> 
 */
@Component("eddie")
@Qualifier("guitar")
public class Instrumentalist implements Performer{
	@Autowired
	private Instrument instrument;

	public void perform() throws PerformanceException {
		instrument.play();
	}

	public Instrument getInstrument() {
		return instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}
}
