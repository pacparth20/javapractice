package hello;

import java.util.Date;

public class EmployeePersonalDetails {

	
	private String employeeCompleteName;
	private int age;
	private Date dataOfBirth;
	private String gender;
    private EmployeeAddresss empAddress;
    
	public String getEmployeeCompleteName() {
		return employeeCompleteName;
	}
	public void setEmployeeCompleteName(String employeeCompleteName) {
		this.employeeCompleteName = employeeCompleteName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getDataOfBirth() {
		return dataOfBirth;
	}
	public void setDataOfBirth(Date dataOfBirth) {
		this.dataOfBirth = dataOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public EmployeeAddresss getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(EmployeeAddresss empAddress) {
		this.empAddress = empAddress;
	}
	@Override
	public String toString() {
		return "EmployeePersonalDetails [employeeCompleteName=" + employeeCompleteName + ", age=" + age
				+ ", dataOfBirth=" + dataOfBirth + ", gender=" + gender + ", empAddress=" + empAddress + "]";
	}
    
    
	
}
