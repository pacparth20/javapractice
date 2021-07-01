package ThreadPractice;

public class PracticeRunnable implements Runnable {

	@Override
	public void run() {
	
		
		System.out.println("running files");
		
	}
		public static void main (String args[]) {
			
			PracticeRunnable s1 = new PracticeRunnable();
			PracticeRunnable s2 = new PracticeRunnable();
			
				Thread t1 = new Thread(s1);
				Thread t2 = new Thread(s2);
				Thread t3 = new Thread(s1);
				
				t1.setPriority(Thread.MAX_PRIORITY);
				t2.setPriority(Thread.MIN_PRIORITY);
				
				t1.start();
				System.out.println("Thread name" + t1.getName());
				System.out.println("Thread priority"+ t1.getPriority());
				
				t2.start();
				System.out.println("Thread name "+ t2.getName());
				System.out.println("Thread priority" +t2.getPriority());
				
				t3.start();
				System.out.println("Thread name" + t3.getName());
				System.out.println("Thread priority" + t3.getPriority());
				
		}
		
}
