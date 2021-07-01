package Factory;

public class Department {
	
	
	private IT it;
	public IT getIt() {
		return it;
	}
	public void setIt(IT it) {
		this.it = it;
	}
	private String deparmentName;
	private String empName;
	private int phoneNo;
	public String getDeparmentName() {
		return deparmentName;
	}
	public void setDeparmentName(String deparmentName) {
		this.deparmentName = deparmentName;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return "Department [it=" + it + ", deparmentName=" + deparmentName + ", empName=" + empName + ", phoneNo="
				+ phoneNo + "]";
	}
	

}
