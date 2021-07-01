package hello;

public class Employee {

	private EmployeeBankDetails empbankDetails;
	private EmployeePersonalDetails empPersonalDetails;
	private EmployeeVisaDetails empVisaDetails;

	public EmployeeBankDetails getEmpbankDetails() {
		return empbankDetails;
	}

	public void setEmpbankDetails(EmployeeBankDetails empbankDetails) {
		this.empbankDetails = empbankDetails;
	}

	public EmployeePersonalDetails getEmpPersonalDetails() {
		return empPersonalDetails;
	}

	public void setEmpPersonalDetails(EmployeePersonalDetails empPersonalDetails) {
		this.empPersonalDetails = empPersonalDetails;
	}

	public EmployeeVisaDetails getEmpVisaDetails() {
		return empVisaDetails;
	}

	public void setEmpVisaDetails(EmployeeVisaDetails empVisaDetails) {
		this.empVisaDetails = empVisaDetails;
	}

	@Override
	public String toString() {
		return "Employee [empbankDetails=" + empbankDetails + ", empPersonalDetails=" + empPersonalDetails
				+ ", empVisaDetails=" + empVisaDetails + "]";
	}

}
