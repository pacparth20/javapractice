package ThreadPractice;

public class PrintTable {

	synchronized void printTable(int n) {// synchronized method
		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
			try {
				// Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}

	public void printData(StudentDetails std) throws InterruptedException {

		System.out.println(" Calculating something....");

		Thread.sleep(5000);

		synchronized (StudentDetails.class) {

//			StudentDetails std = new StudentDetails();
//
//			std.setGrade("A");
//			std.setName("parth");
//			std.setRollNo(23);
			System.out.println("student details saved " + std);
		}

	}

	public StudentDetails setStudentDetails() {

		StudentDetails std = new StudentDetails();

		std.setGrade("A");
		std.setName("parth");
		std.setRollNo(23);

		return std;
	}

}
