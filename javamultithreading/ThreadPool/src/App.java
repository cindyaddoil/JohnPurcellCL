import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Processor implements Runnable {
	private int id;
	public Processor (int id) {
		this.id = id;
	}

	public void run() {
		System.out.println("starting: " + id);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("completed: " + id);
	}
}
public class App {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(2);
		for(int i = 0; i<5; i++ ) {
			executor.submit(new Processor(i));
		}
		executor.shutdown(); //wait all threads  to complete then terminate
		System.out.println("All tasks submitted");
		
		try {
			executor.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} //wait until my task finished
		System.out.println("All tasks completed");
	}

}
