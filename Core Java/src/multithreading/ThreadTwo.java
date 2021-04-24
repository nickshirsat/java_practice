package multithreading;

public class ThreadTwo extends Thread{
	
	public void run() {
		System.out.println("My ThreadTwo running");
		for(int i =0 ; i<10; i++) {
			System.out.println(5*i);
		}
		System.out.println("ThreadTwo finished");
	}
}
