package Factory;

public class IT {
	
	private int numberOfemp;
	private String sector;

	public IT (int numberOfemp,String sector) {
		super();
		this.numberOfemp=numberOfemp;
		this.sector=sector;
	}

	@Override
	public String toString() {
		return "IT [numberOfemp=" + numberOfemp + ", sector=" + sector + "]";
	}
	
}
