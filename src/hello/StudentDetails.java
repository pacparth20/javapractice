package hello;

public class StudentDetails {
	
	private String studentName;
	private int sdtudentRollNo;
	private int studentAge;
	
	public StudentDetails() {}
	
		
	public StudentDetails(String studentName, int sdtudentRollNo) {
		super();
		this.studentName = studentName;
		this.sdtudentRollNo = sdtudentRollNo;
	
	}

	public StudentDetails(String studentName, int sdtudentRollNo, int studentAge) {
		super();
		this.studentName = studentName;
		this.sdtudentRollNo = sdtudentRollNo;
		this.studentAge = studentAge;
	
	}




	@Override
	public String toString() {
		return "StudentDetails [studentName=" + studentName + ", sdtudentRollNo=" + sdtudentRollNo + ", studentAge="
				+ studentAge + "]";
	}
	
	

}
