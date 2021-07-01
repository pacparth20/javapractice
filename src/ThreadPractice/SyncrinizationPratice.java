package ThreadPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SyncrinizationPratice {

	public static void main(String args[]) throws InterruptedException, ExecutionException {

//		ExecutorService exe = Executors.newScheduledThreadPool(2);
//
//		List<callTable> list = new ArrayList<>();
//		list.add(new callTable());
//		list.add(new callTable());
//		
//		 = exe.submit(new callTable());
//		exe.submit(new callTable());

		callTable ct1 = new callTable();

		callTable ct2 = new callTable();

		ct1.start();
		ct2.start();

	}

}

class callTable extends Thread {

//	PrintTable printTable;
//
//	callTable(PrintTable printTable) {
//		this.printTable = printTable;
//	}

	public void run() {
		System.out.println(" thread name" + Thread.currentThread().getName());

		StudentDetails std = new StudentDetails();

		std.setGrade("A");
		std.setName("parth");
		std.setRollNo(23);
		System.out.println(" std " + std);

		PrintTable table = new PrintTable();
//		table.printTable(6);

		try {
			table.printData(std);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}