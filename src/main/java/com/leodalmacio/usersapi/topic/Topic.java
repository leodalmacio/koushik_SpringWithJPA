package com.leodalmacio.usersapi.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {
	
	@Id

	private String id;
	private String name;
	private String dec;
	
	public Topic() {

	}
	
	public Topic(String id, String name, String dec) {
		super();
		this.id = id;
		this.name = name;
		this.dec = dec;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDec() {
		return dec;
	}
	public void setDec(String dec) {
		this.dec = dec;
	}
}
