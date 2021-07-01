package ExceptionHandling;

public class MainException {

		
		public static void catchException(String name) throws InvalidException{
				
			String a  [] = {"parth", "viren","harsh"};
			
			for (int i = 0; i < a.length;) {
				
			 if (a[i].equals(name)) {
				 
				 System.out.println("true");
				 break;
			 }else {
				 
				 throw new InvalidException();
			 }
			}
			
		}
		public static void main (String args []) {
			
			try {
				
				catchException("payal");
			} catch (InvalidException e) {
				System.out.println("false");
			}
		}
	}


