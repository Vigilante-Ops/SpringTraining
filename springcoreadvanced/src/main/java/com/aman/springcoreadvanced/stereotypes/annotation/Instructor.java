package com.aman.springcoreadvanced.stereotypes.annotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("inst")
@Scope("prototype")
public class Instructor {

	@Value("10")
	private int id;// annotation @Value() ovverides int id=1
	@Value("Aman")
	private String name;
	@Value("#{topics}")
	private List<String> topics;
	
	@Value("#{6+1}")
	private int check1;
	
	@Autowired
	private Profile profile;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getTopics() {
		return topics;
	}

	public void setTopics(List<String> topics) {
		this.topics = topics;
	}

	public Profile getProfile() {
		return profile;
	}

	public int getCheck1() {
		return check1;
	}

	public void setCheck1(int check1) {
		this.check1 = check1;
	}

	

}
