package ThreadPractice;

/*
 * Creating Thread by Extending Thread Class
 *
 
 */

public class ThreadPractice extends Thread{
   
	//Method overides Thread
	public void run() {
		System.out.println(" new Thread Method");
	}
	
	public static void main (String args []) {
	
	// cores = Runtime.getRuntime().availableProcessors();
//		
//		
//		
//
//		System.out.println(" no of cores "+ cores);
//		
		
		ThreadPractice tp1 = new ThreadPractice();
		
//		ThreadPractice tp2 = new ThreadPractice();
//		
//		ThreadPractice tp3 = new ThreadPractice();
//		
//		ThreadPractice tp4 = new ThreadPractice();
//		
//		ThreadPractice tp5 = new ThreadPractice();
	
	
		tp1.start();
		tp1.start();
	
	}
	
}
