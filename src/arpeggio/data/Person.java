package arpeggio.data;

public abstract class Person {

	private String firstName;
	private String lastName;
	
	public Person() {
		super();
	}
	
	public Person( String aFirstName, String aLastName ) {
		this.setFirstName(aFirstName);
		this.setLastName(aLastName);
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getFullName() {
		return this.firstName + " " + this.lastName;
	}

	public abstract String stringify();
}
