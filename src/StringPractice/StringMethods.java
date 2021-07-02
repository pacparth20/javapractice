package StringPractice;

import java.util.ArrayList;

public class StringMethods {

	public static void main(String args[]) {

//	
//	String s1 = "parth";
//	String s2 = "harsh";
//	String s3 = "viren";
//	String s4 = "PaRth";
//	String s5 = "Java";
//	
//	
//	System.out.println(s1.equalsIgnoreCase(s2));
//	System.out.println(s1.equalsIgnoreCase(s4));
//	

		String str1 = "mukesh kumar";

		ArrayList<String> list = new ArrayList<>();

		list.add("Mohan");
		list.add("Mukesh");
		list.add("RAVI");
		list.add("MuKesH kuMar");
		list.add("Suresh");
		for (String str : list) {
			String result = (str.equalsIgnoreCase(str1) ? "present" : "not present");

			System.out.println(result);
			// for (String str : list) {
//         if (str.equalsIgnoreCase(str1)) {  
//             System.out.println("Mukesh kumar is present");       
		}
//			int a = 1;
//			
//		ArrayList<Integer> list = new ArrayList<>();
//		list.add(1);
//		list.add(2);
//		list.add(5);
//		for (Integer t1  : list ) {
//			
//			
//			
//		int result	 = ((int)t1 == a) ? 0 :1;
//		
//		/ boolean condition then  true condtion : else false conditon
//			
//		System.out.println(result);
//		
//			if (t1.equals(a)) {

//				System.out.println("present");
//			}else {
//				System.out.println("not present");
//			}

	}
}
