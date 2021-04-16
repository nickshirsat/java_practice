package exceptions;

public class DivideByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 0;
		int result = 0;
		int array[] = {1,2,3,4,5};
		try {
			result = a/b;
			System.out.println(array[10]); // this will not execute
		} catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
		System.out.println("Result is : " + result);
		try {
			System.out.println(array[10]);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
