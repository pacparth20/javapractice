package mainclass;


public class DecendingAsending {

	public static void main(String[] args) {
		

		int a [] = {1,12,42,13,45};
		int j= 0;
		
		for (int i = 0; i < a.length; i++) {
		for (int j1 = 0; j1 < a.length; j1++) {
		if(a[i]>a[j1]) {
			   j = a[i];
			   a[i]= a[j1];
			   a[j1]= j;			 

			
		}
			
			}
		
		
				
			}
		for (int h= 0; h < a.length; h++) {
			System.out.println(a[h]);
		}
			
	
			
		}		
		
	}


