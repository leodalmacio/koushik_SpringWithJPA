package com.leodalmacio.usersapi.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.leodalmacio.usersapi.topic.Topic;

@Entity
public class Course {
	
	@Id

	private String id;
	private String name;
	private String dec;
	
	@ManyToOne
	private Topic topic;
	
	public Course() {

	}
	
	public Course(String id, String name, String dec, String topicId) {
		super();
		this.id = id;
		this.name = name;
		this.dec = dec;
		this.topic = new Topic(topicId, "", "");
	}
	
	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
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
