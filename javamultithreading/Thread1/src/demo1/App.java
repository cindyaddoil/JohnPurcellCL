package demo1;
class Runner extends Thread {
	public void run() {
		for (int i=0; i<10; i++) {
			System.out.println("Hello " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //to slow down thread by ms
		}
	}
	 
}

public class App {
	public static void main (String[] args) {
		Runner runner1 = new Runner();
		runner1.start(); //not call run which will run the code in the main thread
		//if you call runner1.start which Thread class will look for the run method and run that in its own thread
		Runner runner2  = new Runner();
		runner2.start();
	}
}
