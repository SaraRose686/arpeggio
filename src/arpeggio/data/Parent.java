package arpeggio.data;

public class Parent extends Person {

	private String phone;
	private String email;
	
	public Parent() {
		super();
	}
	
	public Parent ( String aFirstName, String aLastName, String aPhone, String aEmail) {
		super(aFirstName, aLastName);
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
		return  this.getFullName() + 
				"; Phone: " + this.phone + 
				"; Email: " + this.email;
	}

}
