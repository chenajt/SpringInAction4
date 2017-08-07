package com.silence.forest.advancedFit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * java装配
 * @modificationHistory.  
 * <ul>
 * <li>clb 2017年8月7日上午11:56:59 TODO</li>
 * </ul> 
 */
@Configuration
public class SpringIdolConfig {
	@Bean
	public Performer duke(){
		return new Juggler();
	}
	
	@Bean
	public Performer duke15(){
		return new Juggler(15);
	}
	
	@Bean
	public Performer poeticDuke(){
		return new PoeticJuggler(15,sonnet29());
	}
	
	@Bean
	private Poem sonnet29(){
		return new Sonnet29();
	}
	
	public static void main(String[] args) throws PerformanceException {
		SpringIdolConfig config = new SpringIdolConfig();
		Performer juggler = config.poeticDuke();
		juggler.perform();
	}
}
