package com.obelixdev.core.bussines.model.customer;

public class Customer {
	
	private String name;
	private String mail;
	private String nick;
	private Integer   id;
	
	public String getName() {
		return name;
	}
	public String getMail() {
		return mail;
	}
	public String getNick() {
		return nick;
	}
	public Integer getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public void setId(Integer id) {
		this.id = id;
	}

}
