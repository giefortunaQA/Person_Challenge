package com.qa.main;

import java.util.ArrayList;
import java.util.List;
	
public class Storage {
	List<Person> people=new ArrayList<>();
	
	public Person retrieve(String name) {
		for (Person person: people) {
			if (person.getName().equals(name)) {
				return person;
			}
		}
		System.out.println("Person not found");
		return null;
	}
	
	public void retrieveAll() {
		for (Person person: people) {
			System.out.println(person.toString());
		}
	}

}
