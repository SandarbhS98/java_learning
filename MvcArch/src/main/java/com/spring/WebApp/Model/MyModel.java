package com.spring.WebApp.Model;

import org.springframework.stereotype.Component;

@Component
public class MyModel {

	private int id;
	private String name;

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

	public MyModel(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public MyModel() {
		super();
	}

	@Override
	public String toString() {
		return "MyModel [id=" + id + ", name=" + name + "]";
	}

}
