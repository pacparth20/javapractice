package mainclass;

public class Calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function func = new Function();
       System.out.println(func.add(2, 7));
       int a=func.add(2, 7);
       int b=func.sub(5, 2);
		System.out.println(func.sub(5, 2));
		System.out.println(func.div(10, 2));
		System.out.println(func.mult(12, 5));
		System.out.println(func.add(12.3f, 15.6f));
		System.out.println(func.sub(12.3f,15.6f));
		
		
		
		}
       
}
