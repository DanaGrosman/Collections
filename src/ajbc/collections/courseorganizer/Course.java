package ajbc.collections.courseorganizer;

public class Course {
	protected String name;
	protected int number;
	protected String schoolName;
	protected int grade;
	
	public Course(String name, int number, String schoolName, int grade) {
		this.name = name;
		this.number = number;
		this.schoolName = schoolName;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + ", number=" + number + ", schoolName=" + schoolName + ", grade=" + grade + "]";
	}
	
	
}
