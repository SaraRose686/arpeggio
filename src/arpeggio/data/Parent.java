package arpeggio.data;

public class Parent extends Person {
/*
 * A Parent class used to capture contact information for the parents of the students.
 */
	private String phone;
	private String email;
	
	public Parent() {
		super();
	}
	
	public Parent ( String aFirstName, String aLastName, Gender aGender, String aPhone, String aEmail) {
		super(aFirstName, aLastName, aGender);
		this.phone = aPhone;
		this.email = aEmail;
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String stringify() {
	/*
	 * Postcondition: A String representation of the Parent class.
	 */
		return  this.getFullName() + 
				"; Phone: " + this.phone + 
				"; Email: " + this.email;
	}

}
