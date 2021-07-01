package hello;

import java.util.Date;

public class EmployeeVisaDetails {

	private int passportNo;
	private String passportHolderName;
	private Date passportExpirtData;
	private boolean ifUsaVisaAvailable;

	public int getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(int passportNo) {
		this.passportNo = passportNo;
	}

	public String getPassportHolderName() {
		return passportHolderName;
	}

	public void setPassportHolderName(String passportHolderName) {
		this.passportHolderName = passportHolderName;
	}

	public Date getPassportExpirtData() {
		return passportExpirtData;
	}

	public void setPassportExpirtData(Date passportExpirtData) {
		this.passportExpirtData = passportExpirtData;
	}

	public boolean isIfUsaVisaAvailable() {
		return ifUsaVisaAvailable;
	}

	public void setIfUsaVisaAvailable(boolean ifUsaVisaAvailable) {
		this.ifUsaVisaAvailable = ifUsaVisaAvailable;
	}

	@Override
	public String toString() {
		return "EmployeeVisaDetails [passportNo=" + passportNo + ", passportHolderName=" + passportHolderName
				+ ", passportExpirtData=" + passportExpirtData + ", ifUsaVisaAvailable=" + ifUsaVisaAvailable + "]";
	}

}
