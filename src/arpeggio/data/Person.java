package arpeggio.data;

public abstract class Person {
/*
 * An abstract Person class used to capture the names of all Person sub-classes.
 */
	
	private String firstName;
	private String lastName;
	private Gender gender;
	
	public Person() {
		super();
	}
	
	public Person( String aFirstName, String aLastName, Gender aGender) {
		this.setFirstName(aFirstName);
		this.setLastName(aLastName);
		this.gender = aGender;
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
	
	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public String getGenderString() {
		return this.gender.getText();
	}
	
	public String getFullName() {
	/*
	 * Postcondition: A concatenation of FirstName LastName returned as one String.
	 */
		return this.firstName + " " + this.lastName;
	}

	public abstract String stringify();
	
	public enum Gender {
	/*
	 * A Gender enum used to distinguish a person's gender.
	 */
		M("Male"),
		F("Female"),
		N("Non-Binary"),
		U("Unknown");
		
		private final String text;
		
		Gender(String aText) {
			this.text = aText;
		}
		
		public String getText() {
			return text;
		}
	}
}
