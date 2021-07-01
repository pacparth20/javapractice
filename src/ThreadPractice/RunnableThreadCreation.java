package ThreadPractice;

public class RunnableThreadCreation implements Runnable {

	@Override
	public void run() {

//		try {
////			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
		//}
		System.out.println(" Runnning the file");
	}

	public static void main(String args[]) throws InterruptedException {

		long startTime = System.currentTimeMillis();

		RunnableThreadCreation tp1 = new RunnableThreadCreation();

		ThreadPractice tp2 = new ThreadPractice();

		Thread t1 = new Thread(tp1);
		
		Thread t2 = new Thread(tp2);

		Thread t3 = new Thread(tp1);

		Thread t4 = new Thread(tp1);
		t3.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t1.setPriority(Thread.MIN_PRIORITY);
		t4.setPriority(Thread.MIN_PRIORITY);
		
		
		t1.start();
		System.out.println();
		System.out.println(" Thread name t1 " + t1.getName());

//		 t1.setPriority(10);
//		
//		System.out.println(" Thread name t1 "+t1.getPriority());

		t1.join();

		t2.start();
		t2.join();
		System.out.println();
		System.out.println(" Thread name " + t2.getName());

		t3.start();
		t3.join();
		System.out.println();
		System.out.println(" Thread name " + t3.getName());

		System.out.println(" Thread name t3 " + t3.getPriority());

		t4.start();
		t4.join();
		System.out.println();
		System.out.println(" Thread name " + t4.getName());

		long endTime = System.currentTimeMillis();

		long differenceInTime = endTime - startTime;

		System.out.println(" Total execution time : - " + differenceInTime);

	}

}
