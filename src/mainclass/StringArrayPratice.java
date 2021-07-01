package mainclass;

public class StringArrayPratice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 String practiceArray [] = {"name", "1", "2", "jame12","parth123", "12htc"};
		 
		 //compare String
		String a = "parth";
		 
		if (a.equals("parth123")) {
			
			System.out.println("it is parth");
			
		}
		else {
			System.out.println("not a parth");
		}
		
		//Compare int
		
		int b = 11;
		
		if(b[] == 10) {
			
			System.out.println("b is equal to 10");
		}else {
			System.out.println("b is not equal to 10");
		}
		
		ifInteger("parth123");
		
		System.out.println(practiceArray[0]);
		System.out.println(practiceArray[1]);
		System.out.println(practiceArray[2]);
		System.out.println(practiceArray[3]);
		System.out.println(practiceArray[4]);
	}

	public static boolean ifInteger(String toCheck) {
		
		boolean result = true;
		
		try {

			int intValue = Integer.valueOf(toCheck);

			result = true;
			
			System.out.println("try block");
		} catch (Exception e) {

			result = false;
			System.out.println("catch block");
		}
		
		return result;
		
	}
	
	
}
