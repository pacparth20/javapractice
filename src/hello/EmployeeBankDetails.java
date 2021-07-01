package hello;

import java.util.Date;

public class EmployeeBankDetails {

	private int accountNo;
	private String accountName;
	private Date accountCreationDate;
	private String ifscCode;

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public Date getAccountCreationDate() {
		return accountCreationDate;
	}

	public void setAccountCreationDate(Date accountCreationDate) {
		this.accountCreationDate = accountCreationDate;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	@Override
	public String toString() {
		return "EmployeeBankDetails [accountNo=" + accountNo + ", accountName=" + accountName + ", accountCreationDate="
				+ accountCreationDate + ", ifscCode=" + ifscCode + "]";
	}

}
