package ThreadPractice;

public class StudentDetails {

	private String name;
	private int rollNo;
	private String grade;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "StudentDetails [name=" + name + ", rollNo=" + rollNo + ", grade=" + grade + "]";
	}

}
