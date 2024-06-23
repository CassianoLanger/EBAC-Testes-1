package com.cassiano.program;

import java.util.List;

import com.cassiano.filter.Filter;
import com.cassiano.model.Person;

public class Main {
	
	public static void main(String[] args) {
		List<Person> persons = new Person().doPersonsList();
		List<Person> woman = new Filter().women(persons);
		
		woman.stream().forEach(System.out::println);
	}
}
