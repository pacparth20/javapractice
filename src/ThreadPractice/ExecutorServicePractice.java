package ThreadPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServicePractice {

	public static void main(String args[]) throws InterruptedException, ExecutionException {

		ExecutorService exe = Executors.newScheduledThreadPool(2);

		List<Callable<String>> listOfFfiles = new ArrayList<>();
		listOfFfiles.add(new CheckIfFileSaved());
		listOfFfiles.add(new CheckIfFileSaved());
		listOfFfiles.add(new CheckIfFileSaved());
		listOfFfiles.add(new CheckIfFileSaved());

		List<Future<String>> getAllSavedFileData = exe.invokeAll(listOfFfiles);

		for (Future<String> future : getAllSavedFileData) {

			if (future.isDone()) {

				String data = future.get();

				System.out.println(" data " + data);
			}
		}

	}

}

//class saveFile extends Thread {
//
//	public void run() {
//
//		System.out.println(" file saved sucessfully ...");
//
//	}
//}

class CheckIfFileSaved implements Callable<String> {

	@Override
	public String call() throws Exception {
		
		
		System.out.println(" file operation completed and saved successfully");
		
		Thread.sleep(5000);
		return "success";
	}

}