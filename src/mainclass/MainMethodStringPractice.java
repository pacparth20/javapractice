package mainclass;

public class MainMethodStringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "parth";

		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());

		StringBuilder builder = new StringBuilder();

		StringBuffer buffer = new StringBuffer();

		int [] phoneNumber = {123456,12345,1212121,2342342,56756756,567567,};
		String [] nameList = {"abcd","john","Mark","Roy","Walley","Pankaj"};
		
		
		
		for(int i = 0; i < phoneNumber.length ; i++) {
			
			System.out.println(nameList[i]);
			System.out.println(phoneNumber[i]);
			
			
		}
		
		
		int c = 0 ;
		
		
		System.out.println(" name : abcd  and  phone number : ");


       int [] a = {1,2,3,4,5,6};
       
       for (int i = 0 ; i < a.length ; i++) {
    	   
    	   
			System.out.println(a[i]);
			
			
           c = c + a[i];
          
       }
       System.out.println(c);
       
       
       int [] z = {5,4,3,2,1};
       
       for (int i = z.length -1; i >=0; i--) {
    	   
    	   System.out.println("z" + z[i]);
       }
       
       
       
       
       
	}

		
}
