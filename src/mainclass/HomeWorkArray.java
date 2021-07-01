package mainclass;

public class HomeWorkArray {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub

		 String practiceArray [] = {"parth", "1", "2", "jame12","parth123", "parth"};

		 for (int i =0 ; i< practiceArray.length;i++) {
			 
			 System.out.println("i "+i);


			 System.out.println("Array Value "+practiceArray[i]);
		 }
		 
		
		int a [] = {1,2,3,4,5,6};
		
		for (int i=0; i< a.length; i++) {
			
			System.out.println(a[i]);
		}
		
		
		int[] b = new int [10];
		b[0] = 1;
		b[1] = 2;
		b[2] = 3;
		b[3] = 4;
		b[4] = 5;
		b[5] = 6;
		b[6] = 7;
		b[7] = 6;
		
			
      for (int i= 0 ; i < 10; i++) {
		  
	  System.out.println(b[i]);
		
	  if (b[i]==5) {
			
			System.out.println("interger equal to 5");
		
	}	else if (b[i]==6) {
		System.out.println("equal to 6");
	}
	  else
	  {
		  System.out.println("interger is not equal to 5 or 6");
	  }
		
	}}}


