package lowlevelthread;

import java.util.Scanner;

public class Processor {
	public void produce() throws InterruptedException {
		synchronized (this) {
			System.out.println("Producer thread running ...");
			wait(); //only can called in synchronized block
			System.out.println("Resumed."); //notify and resumed the mutex
		}
	}
	public void consume() throws InterruptedException {
		Scanner scanner = new Scanner(System.in);
		
		Thread.sleep(2000);
		synchronized (this) {
			System.out.println("waiting for the return key ...");
			scanner.nextLine();
			System.out.println("return key pressed ...");
			notify(); //only can called in synchronized block. notfiy all threads waiting this lock
		}
	}
}
