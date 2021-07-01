package Factory;

public class EmployeeDetail {
	
	private String empName;
	private String address;
	private int age;
	private int phoneNo;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return "EmployeeDetail [empName=" + empName + ", address=" + address + ", age=" + age + ", phoneNo=" + phoneNo
				+ "]";
	}
	

}
