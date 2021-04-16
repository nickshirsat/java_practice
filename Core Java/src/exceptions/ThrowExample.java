package exceptions;

public class ThrowExample {
	int result;
	
	void divideError(int a, int b) {
		if(b == 0) {
			throw new ArithmeticException("Divide by 0");
		} else {
			result = a/b;
			System.out.println(result);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowExample t = new ThrowExample();
		try {			
			t.divideError(10, 0);
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("rest of the logic");
	}

}
