package arpeggio.data;

public class Student extends Person {

	private int age;
	private Gender gender;
	private PianoLevel level;
	private SchoolGrade grade;
	
	public Student() {
		super();
	}
	
	public Student( String aFirstName, String aLastName, int aAge, 
			Gender aGender, SchoolGrade aGrade, PianoLevel aLevel ) {
		super(aFirstName, aLastName);
		this.age = aAge;
		this.gender = aGender;
		this.grade = aGrade;
		this.level = aLevel;
	}
	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
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
		return  this.getFullName() + 
				"; Age: " + this.age +
				"; Gender: " + this.gender.getText() +
				"; Level: " + this.level.getText() +
				"; Grade: " + this.grade.getText();
	}
	
	
	public enum Gender {
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
	
	public enum PianoLevel {
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
