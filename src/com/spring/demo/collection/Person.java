package com.spring.demo.collection;

import java.util.List;

import com.spring.demo.Car;

public class Person {
	private String name;
	
	private int age;
	
	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	private List<Car> cars;

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
		return "Person [name=" + name + ", age=" + age + "cars=" + cars + "]";
	}

	public Person() {
		super();
	}

	public Person(String name, int age, Car car) {
		super();
		this.name = name;
		this.age = age;
	}
	
}
