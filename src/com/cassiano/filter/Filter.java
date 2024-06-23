package com.cassiano.filter;

import java.util.List;
import java.util.stream.Collectors;

import com.cassiano.model.Person;

public class Filter {

	public List<Person> women(List<Person> people){
		 List<Person> women = people.stream().filter(woman -> woman.getGender().equals("F")).collect(Collectors.toList());;
		 return women;
	}
	
	public List<Person> men(List<Person>people){
		
		List<Person> men = people.stream().filter(man -> man.getGender().equals("M")).collect(Collectors.toList());
		return men;
	}
}
