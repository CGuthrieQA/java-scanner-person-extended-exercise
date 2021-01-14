package com.qa.main;

public class Runner {

	public static void main(String[] args) {

		Person p1 = new Person("Tim", 99, "The Enchanter");
		Person p2 = new Person("Lucy", 32, "TRX Instructor");
		Person p3 = new Person("Harold", 75, "Awkwardly Smiles");
		
		PeopleList people = new PeopleList();
		people.addPeople(p1);
		people.addPeople(p2);
		people.addPeople(p3);
		
		
		people.printList();
		
		people.findPerson("Tim");
	}

}
