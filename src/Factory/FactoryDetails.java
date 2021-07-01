package Factory;

public class FactoryDetails {

	public static void main(String[] args) {
		
		try {
		IT it = new IT(100,"programing");
		System.out.println(it);
		
		Account acc = new Account();
		acc.setType("accounting");
		acc.setDetails("monthly");
		System.out.println(acc);
		
		
		EmployeeDetail empdetail = new EmployeeDetail();
		empdetail.setEmpName("parth");
		empdetail.setAddress("A/19 yashwant CHS,thane (W)");
		empdetail.setAge(22);
		empdetail.setPhoneNo(75062934);
		
		System.out.println(empdetail);
		
		Department department = new  Department ();
		department.setDeparmentName("accounts ");
		department.setEmpName("parth");
		department.setPhoneNo(1234567);
		department.setIt(it);
		System.out.println(department);
	
		
		String  s = null;
		
		if(s.equals("jihn")) {
			
			System.out.println("correct");
		}else {

			System.out.println("incorrect");

			
		}
		
			
			
			
			
			
			
		}
	catch (Exception e) {
		e.printStackTrace();
		
	}
	}

}
