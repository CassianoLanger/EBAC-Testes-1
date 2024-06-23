package com.cassiano.model;

import java.util.Arrays;
import java.util.List;

public class Person {

	private String name;
	private String gender;
	
	public Person() {
		
	}

	public Person(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<Person> doPersonsList(){
		Person person = new Person("Cassiano","M");
		Person person1 = new Person("Tales","M");
		Person person2 = new Person("Henrique","M");
		Person person3 = new Person("Luiz","M");
		Person person4 = new Person("Renata","F");
		Person person5 = new Person("Patricia","F");
		Person person6 = new Person("Leticia","F");
		Person person7 = new Person("Carina","F");
		Person person8 = new Person("Rita","F");
		Person person9 = new Person("Sabrina","F");
		Person person10 = new Person("Fernanda","F");
		
		List<Person> persons = Arrays.asList(person,person1, person2, person3, person4,
				person5,person6,person7,person8,person9,person10);
		
		return persons;
	}
	@Override
	public String toString() {
		return "name=" + name + ", gender=" + gender;
	}
	
}
