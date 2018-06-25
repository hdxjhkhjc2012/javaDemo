package com.spring.demo.collection;

import java.util.Map;

import com.spring.demo.Car;

public class NewPerson {
	private String name;
	
	private int age;
	
	private Map<String,Car> cats;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "NewPerson [name=" + name + ", age=" + age + ", cats=" + cats
				+ ", getName()=" + getName() + ", getAge()=" + getAge()
				+ ", getCats()=" + getCats() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public Map<String, Car> getCats() {
		return cats;
	}

	public void setCats(Map<String, Car> cats) {
		this.cats = cats;
	}
	
	
}
