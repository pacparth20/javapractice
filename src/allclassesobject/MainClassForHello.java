package allclassesobject;

import java.text.SimpleDateFormat;
import java.util.Date;

import hello.Employee;
import hello.EmployeeAddresss;
import hello.EmployeeBankDetails;
import hello.EmployeePersonalDetails;
import hello.EmployeeVisaDetails;

public class MainClassForHello {
	public static void main(String args[]) {
		try {

			Employee emp = new Employee();

			EmployeeAddresss empAddress = new EmployeeAddresss();
			empAddress.setCountry("India");
			empAddress.setPermanentAdress("Kutch Madhapart Navavas 370020");
			empAddress.setPinCode(370020);
			empAddress.setTemporaryAddress(empAddress.getPermanentAdress());
			empAddress.setState("Gujarat");
			
//			System.out.println("emp empAddress  " + empAddress);
			System.out.println();

			EmployeePersonalDetails empPersonalDetails = new EmployeePersonalDetails();
			empPersonalDetails.setEmpAddress(empAddress);
			empPersonalDetails.setAge(22);

			Date empDob = new SimpleDateFormat("yyyy/MM/dd").parse("2012/05/05");

			empPersonalDetails.setDataOfBirth(empDob);
			empPersonalDetails.setEmployeeCompleteName("Harsh Vagadia");
			empPersonalDetails.setGender("Male");

			Date empAccountCreationDate = new SimpleDateFormat("yyyy/MM/dd").parse("2018/05/05");

			EmployeeBankDetails empBankDetails = new EmployeeBankDetails();
			empBankDetails.setAccountCreationDate(empAccountCreationDate);
			empBankDetails.setAccountName(empPersonalDetails.getEmployeeCompleteName());
			empBankDetails.setAccountNo(123546546);
			empBankDetails.setIfscCode("HDFC123456");

//			System.out.println("emp empBankDetails  " + empBankDetails);
System.out.println();
			EmployeeVisaDetails empVisaDetails = new EmployeeVisaDetails();
			empVisaDetails.setIfUsaVisaAvailable(false);

			Date passportExpiryDate = new SimpleDateFormat("yyyy/MM/dd").parse("2022/05/05");
			empVisaDetails.setPassportExpirtData(passportExpiryDate);
			empVisaDetails.setPassportHolderName(empPersonalDetails.getEmployeeCompleteName());
			empVisaDetails.setPassportNo(5555555);
			System.out.println("emp empVisaDetails  " + empVisaDetails);

			emp.setEmpbankDetails(empBankDetails);
			emp.setEmpPersonalDetails(empPersonalDetails);
			emp.setEmpVisaDetails(empVisaDetails);
			System.out.println();


//			System.out.println("emp Details " + emp);
			System.out.println("emp personalDetails  " + emp.getEmpPersonalDetails());
			System.out.println("emp address  " + emp.getEmpPersonalDetails().getEmpAddress());
			System.out.println("emp empVisaDetails  " + emp.getEmpVisaDetails());
			System.out.println("emp bank details  " + emp.getEmpbankDetails());



		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
