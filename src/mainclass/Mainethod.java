package mainclass;

/*This code is generated by Author - Parth
 * This method is main method to iterate all class object
 */
public class Mainethod {

	public static void main(String[] args) {

   int a [] = {1, 2,3 ,4 ,5};
   //This is below for loop to iterate integer array
   for (int i = 0 ; i < a.length ; i++) {
	   
	   System.out.println(a[i]);
   }
		
   
   String b [] = {"parth","Harsh","Virain"};

 for (int i = 0 ; i < b.length ; i++) {
	   
	   System.out.println(b[i]);
	   
	   String value = b[i];
	   // convert string to char
	   for(int j = 0; j < value.length(); j++) {
		   
		   
		  char[] charArray = value.toCharArray();
		   
		   System.out.println(charArray[j]);
		   
	   }
	   
	   char newChar [] = {'p','a','r','t','h'};
//	  used to convert char into string  
	   String name = String.valueOf(newChar);
	   
	   System.out.println(name);
	  
	   
	   String charToName = "";
	   
	   for(int k = 0 ; k < newChar.length ; k ++) {
		   
		   charToName=charToName.concat(String.valueOf(newChar[k]));
		   
	   }
	   System.out.println(" charToName "+charToName);
	   
   }
 
 
 String convertToInt = "2";
 System.out.println(Integer.valueOf(convertToInt));
 
 boolean val1 = false;
 
 System.out.println(String.valueOf(val1));
 
 
 if (val1 == false) {
	 System.out.println(" if parth");
 }else {
	System.out.println("else no parth ");
 }
 
 
 

 
	   }
	   
}