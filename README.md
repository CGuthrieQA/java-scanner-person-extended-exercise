# input with scanner exercises

## Person Extended With Menu

1. Add a menu that prints options to the user for each of the following functionalities; create person, output all people to console, and search for a specific person.

2. Take user input from the menu and run the functionality they have chosen, taking user input where necessary.
For example when the user wants to create a person, take user input for name, age, and job title.

```Java
package com.qa.main;

import java.util.Scanner;

public class Runner {
	
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		ScannerController.scannerController();
		
		// GI -> GO
		input.close();
		
		System.out.println("\ninput closed");
	}

}

```

```Java
package com.qa.main;

public class ScannerController {
	
	public static void scannerController() {
	
		System.out.println("Scanner is running.");
		
		//dummy data
		Person p1 = new Person("Tim", 99, "The Enchanter");
		Person p2 = new Person("Lucy", 32, "TRX Instructor");
		Person p3 = new Person("Harold", 75, "Awkwardly Smiles");
		
		// create list for people
		PeopleList people = new PeopleList();
		
		// add dummy data to list
		
		people.addPeople(p1);
		people.addPeople(p2);
		people.addPeople(p3);
		
		// variables
		String result;
		String name;
		int age;
		String jobTitle;
		
		System.out.println("\nWhat method would you like to use?\rCREATE\rLIST\rSEARCH");
		
		result = Runner.input.nextLine();
		
		switch(result) {
			case "CREATE":
				
				System.out.println("\nCREATE\rEnter Name: ");
				result = Runner.input.nextLine();
				name = result;

				System.out.println("Enter Age: ");
				result = Runner.input.nextLine();
				age = Integer.parseInt(result);
				

				System.out.println("Enter Job Title: ");
				result = Runner.input.nextLine();
				jobTitle = result;
				
				Person placeholderPerson = new Person(name, age, jobTitle);

				System.out.println("Created person:\r" + placeholderPerson);
				people.addPeople(placeholderPerson);
				
				break;
				
			case "LIST":
				System.out.println("\nLIST\rPeople:");
				people.printList();
				break;
			case "SEARCH":
				System.out.println("\nSEARCH\rEnter Name: ");
				result = Runner.input.nextLine();
				name = result;
				people.findPerson(name);
				break;
			default:
				System.out.println("unknown entry");
				break;
		}
	
	}

}

```