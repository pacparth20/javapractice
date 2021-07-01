package hello;

public class EmployeeAddresss {
	
	private int pinCode;
	private String state;
	private String permanentAdress;
	private String temporaryAddress;
	private String country;
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPermanentAdress() {
		return permanentAdress;
	}
	public void setPermanentAdress(String permanentAdress) {
		this.permanentAdress = permanentAdress;
	}
	public String getTemporaryAddress() {
		return temporaryAddress;
	}
	public void setTemporaryAddress(String temporaryAddress) {
		this.temporaryAddress = temporaryAddress;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "EmployeeAddresss [pinCode=" + pinCode + ", state=" + state + ", permanentAdress=" + permanentAdress
				+ ", temporaryAddress=" + temporaryAddress + ", country=" + country + "]";
	}
	

}
