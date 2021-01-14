package com.qa.main;

import java.util.ArrayList;
import java.util.List;

public class PeopleList {
	
	public List<Person> people = new ArrayList<>();
	
	public void addPeople(Person input) {
		people.add(input);
	}
	
	public void printList() {

		for ( Person i : people ) {
			System.out.println(i);
		}
		
	}
	
	public void findPerson(String input) {
		for ( Person i : people ) {
			if ( i.name.equals(input) ) {
				System.out.println("Person found!\r" + i);
			}		
		}
	}
	
}
