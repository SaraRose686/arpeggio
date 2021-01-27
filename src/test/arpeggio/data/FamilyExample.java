package test.arpeggio.data;

import java.util.ArrayList;

import arpeggio.data.Family;
import arpeggio.data.Parent;
import arpeggio.data.Person;
import arpeggio.data.Person.Gender;
import arpeggio.data.Student;
import arpeggio.data.Student.PianoLevel;
import arpeggio.data.Student.SchoolGrade;

public class FamilyExample {
/*
 * An executable class to test the creation and printing of Families.
 */
	public static ArrayList<Family> theFamilies = new ArrayList<Family>();
	
	public static void main(String[] args) {
	/*
	 * Intent: Test print() on Family example
	 * 
	 * Postcondition 1 (theFamilies): theFamilies consists of all Families 
	 * (short for "Family objects") created by this application
	 * Post2 (Various): Various Persons exists within various Families
	 * Post3 (Print): As for print() for each of the Families
	 * Post4 (Counts): As for displayTypeCount()
	 */
		
		// Post 1 (theFamilies) & Post 2 (Various)
		populateFamilies();
		
		// Post 3 (Print)
		for( Family fam : theFamilies ) {
			fam.print();
			System.out.println();
		}
	
		// Post 4 (Counts)
		displayTypeCount();
	}
	
	
	private static void populateFamilies() {
	/* 
	 * Postcondition: theFamilies ArrayList is populated with various Person objects
	 */
		
		Family smithFamily = new Family("Smith");
		
		smithFamily.add(new Parent("John", "Smith", Gender.M, "555-1234", "john.smith@email.com"));
		smithFamily.add(new Parent("Jane", "Smith", Gender.F, "555-4321", "jane.smith@email.com"));
		smithFamily.add(new Student("Joey", "Smith", 10, Gender.M, SchoolGrade.GRADE_5, PianoLevel.LEVEL_2A));
		
		theFamilies.add(smithFamily);
		
		Family jonesFamily = new Family("Jones");
		
		jonesFamily.add(new Parent("Ted", "Jones", Gender.M, "555-5678", "ted.jones@email.com"));
		jonesFamily.add(new Parent("Kristen", "Jones", Gender.F, "555-8765", "kristen.jones@email.com"));
		jonesFamily.add(new Student("Teddy", "Jones", 6, Gender.M, SchoolGrade.GRADE_1, PianoLevel.PRIMER));
		jonesFamily.add(new Student("Krista", "Jones", 9, Gender.F, SchoolGrade.GRADE_4, PianoLevel.LEVEL_2A));
		
		theFamilies.add(jonesFamily);
		
		Family chenFamily = new Family("Chen");
		
		chenFamily.add(new Parent("Molly", "Chen", Gender.F, "555-9999", "molly.chen@email.com"));
		chenFamily.add(new Student("Peter", "Chen", 12, Gender.M, SchoolGrade.GRADE_7, PianoLevel.LEVEL_3B));
		
		theFamilies.add(chenFamily);
		
	}

	
	static void displayTypeCount() {
	/*
	 *  Postcondition: The number of Parents and Students in theFamilies are on the console
	 */  
	    int parentCount = 0, studentCount = 0;
		for (Family f : theFamilies) {
	        for (Person p : f.getPersons()) {
	        	if (p instanceof Parent) {
		        	parentCount += 1;
		        }
		        else {
		        	studentCount += 1;
		        }
	        }
	    }
		System.out.println(parentCount + " parents and " + studentCount + " students.");
	}
	
}
