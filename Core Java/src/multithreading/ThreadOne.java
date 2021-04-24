package multithreading;

public class ThreadOne extends Thread{

	@Override
	public void run() {
		System.out.println("My ThreadOne running");
		Integer num = 12345;
		int reversed = 0;
		num = Integer.reverse(num);
		System.out.println(num);
//		while(num != 0) {
//			int digit = num%10;
//			num /= 10;
//			reversed = reversed*10 + digit;
//		}
		System.out.println(reversed);
		System.out.println("threadone finished");
	}
}
