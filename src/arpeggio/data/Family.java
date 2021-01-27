package arpeggio.data;

import java.util.ArrayList;
import java.util.List;

public class Family {
/*
 * A Family class used to capture all the Persons in the same family.
 */

	private String name;
	private List<Person> persons;
	
	public Family() {
		this.persons = new ArrayList<Person>();
	}
	
	public Family( String aName ) {
		this.setName(aName);
		persons = new ArrayList<Person>();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Person> getPersons() {
		return (ArrayList<Person>) persons;
	}
	
	public void add( Person aPerson ) {
		persons.add(aPerson);
	}
	
	public void print() {
	/*
	 * Postcondition: Print the Family information to the console.
	 */
		System.out.println("The " + this.name + " Family");
		
		for(Person p : this.persons) {
			if( p instanceof Parent ) {
				System.out.print("Parent:  ");
			}
			else {
				System.out.print("Student: ");
				
			}
			System.out.println(p.stringify());
		}
	}
}
