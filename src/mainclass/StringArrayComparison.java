package mainclass;

public class StringArrayComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String practiceArray [] = {"parth", "1", "2", "jame12","parth123", "parth"};

		 for (int i=0;i<practiceArray.length;i++) {
			 System.out.println(practiceArray[i]);
			if (practiceArray[i].equals("parth")) {
				System.out.println("equal to parth");
				
			}else
			{
				System.out.println("not parth");
			}
		 }
	
		
	}

}
