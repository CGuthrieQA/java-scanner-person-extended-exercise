# input with scanner exercises

## Person

1. Create a Person class that contains the following attributes:
	* Name
	* Age
	* Job Title

```Java
package com.qa.main;

public class Person {
	
	//variables
	
	protected String name;
	protected int age;
	protected String jobTitle;

}
```

2. Create a method to return all three of these attributes in a formatted String.
	HINT: Override the toString() method.

```Java
@Override
public String toString() {
	return "Person [name=" + name + ", age=" + age + ", jobTitle=" + jobTitle + "]";
}
```

3. Create some example objects with this class.

```Java
Person p1 = new Person("Tim", 99, "The Enchanter");
Person p2 = new Person("Lucy", 32, "TRX Instructor");
Person p3 = new Person("Harold", 75, "Awkwardly Smiles");
```

4. Create a List implementation and store those objects inside it.

```Java
package com.qa.main;

import java.util.ArrayList;
import java.util.List;

public class PeopleList {
	
	public List<Person> people = new ArrayList<>();
	
	public void addPeople(Person input) {
		people.add(input);
	}

}
```

5. Use a stream to output all of your people to the console.

```Java
PeopleList people = new PeopleList();
people.addPeople(p1);
people.addPeople(p2);
people.addPeople(p3);


people.printList();
```


6. Create a method that can search for a specific Person by their name.

```Java
public void findPerson(String input) {
	for ( Person i : people ) {
		if ( i.name.equals(input) ) {
			System.out.println(i);
		}		
	}
}
```

```Java
people.findPerson("Tim");
```
