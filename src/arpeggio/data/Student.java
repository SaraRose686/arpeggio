package arpeggio.data;

public class Student extends Person {
/*
 * A Student class used to capture demographic and level information of the student.
 */
	private int age;
	private PianoLevel level;
	private SchoolGrade grade;
	
	public Student() {
		super();
	}
	
	public Student( String aFirstName, String aLastName, int aAge, 
			Gender aGender, SchoolGrade aGrade, PianoLevel aLevel ) {
		super(aFirstName, aLastName, aGender);
		this.age = aAge;
		this.grade = aGrade;
		this.level = aLevel;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public PianoLevel getLevel() {
		return level;
	}

	public void setLevel(PianoLevel level) {
		this.level = level;
	}

	public SchoolGrade getGrade() {
		return grade;
	}

	public void setGrade(SchoolGrade grade) {
		this.grade = grade;
	}

	@Override
	public String stringify() {
	/*
	 * Postcondition: A String representation of the Student class.
	 */
		return  this.getFullName() + 
				"; Age: " + this.age +
				"; Gender: " + this.getGenderString() +
				"; Level: " + this.level.getText() +
				"; Grade: " + this.grade.getText();
	}

	/* ********* PUBLIC ENUMS ********* */
	
	public enum PianoLevel {
	/*
	 * A Piano Level enum to capture the level the student is currently taking.
	 */
		PRIMER("Primer"), 
		LEVEL_1("1"), 
		LEVEL_2A("2A"), 
		LEVEL_2B("2B"), 
		LEVEL_3A("3A"), 
		LEVEL_3B("3B"), 
		LEVEL_4("4"), 
		LEVEL_5("5"), 
		ADULT_1("Adult 1"), 
		ADULT_2("Adult 2");
		
		private final String text;
		
		PianoLevel(String aText) {
			this.text = aText;
		}

		public String getText() {
			return text;
		}
	}
	
	public enum SchoolGrade {
	/*
	 * A School Grade enum to capture the grade the student is currently in or if they are an Adult.
	 */
		PRESCHOOL("Pre-school"), 
		KINDERGARTEN("K"), 
		GRADE_1("1st"), 
		GRADE_2("2nd"), 
		GRADE_3("3rd"), 
		GRADE_4("4th"), 
		GRADE_5("5th"), 
		GRADE_6("6th"), 
		GRADE_7("7th"), 
		GRADE_8("8th"), 
		HIGH_SCHOOL("HS"), 
		ADULT("Adult");
		
		private final String text;
		
		SchoolGrade(String aText) {
			this.text = aText;
		}

		public String getText() {
			return text;
		}
	}
}
