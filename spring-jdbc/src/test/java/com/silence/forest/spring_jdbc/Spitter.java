package com.silence.forest.spring_jdbc;

import java.util.List;

public class Spitter {
	private Long id;
	private String userName;
	private String password;
	private String fullName;
	private List<Spittle> spittes;
	private String email;
	private boolean updateByEmail;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public List<Spittle> getSpittes() {
		return spittes;
	}

	public void setSpittes(List<Spittle> spittes) {
		this.spittes = spittes;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isUpdateByEmail() {
		return updateByEmail;
	}

	public void setUpdateByEmail(boolean updateByEmail) {
		this.updateByEmail = updateByEmail;
	}

	@Override
	public boolean equals(Object obj){
		Spitter other = (Spitter) obj;
		return other.fullName.equals(fullName)&&other.userName.equals(userName)&&other.password.equals(password);
	}
	
	@Override
	public int hashCode(){
		return super.hashCode();
	}
}
