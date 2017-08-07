package com.silence.forest.spring_jdbc;

import java.util.Date;

public class Spittle {
	private Long id;
	private Spitter spitter;
	private String text;
	private Date when;
	
	public Spittle(){
		this.spitter = new Spitter();
		this.spitter.setId((long)1);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Spitter getSpitter() {
		return spitter;
	}

	public void setSpitter(Spitter spitter) {
		this.spitter = spitter;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getWhen() {
		return when;
	}

	public void setWhen(Date when) {
		this.when = when;
	}
	
}
