package exceptions;

public class MultiCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 0;
		int result = 0;
		int array [] = {1,2};
		try {
			System.out.println(array[10]);
			result = a/b;
		} catch (ArithmeticException ae) {
			// TODO: handle exception
			ae.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException ai) {
			ai.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
