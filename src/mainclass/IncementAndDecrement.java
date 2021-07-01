package mainclass;

public class IncementAndDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		
		int b = a;
		
		int c = a ;
		
		
	for(int i = 0; i < a ; i++) {
		
		System.out.println(" i  "+ i);

		
		System.out.println(" a --  "+ b--);
		
		
		System.out.println(" a ++   "+ c++);
	}
		
		String first = "madam";
		String second = "parth";
		
		int n= second.length()-1;
		
		for (int i = 0; i < first.length(); i++) {
			
			char z= first.charAt(i);
			System.out.println(z);
			
		   char y= second.charAt(n);
		   System.out.println(y);
		n--;
		if (z == y){
			System.out.println("equal to");
			}
		else {
			System.out.println("not equal to");
		}
		}
	}}
		
