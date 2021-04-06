package fundamentals;
class Human {
	void print() {
		System.out.println("from class Human");
	}
}

class Man extends Human {
	
	void print() {
		System.out.println("from class Man");
	}
	void sleep() {
		System.out.println("Man sleeps");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human h = new Man();
		System.out.println("1st");
		h.print();
		
		System.out.println("2nd");
		Man m = (Man) h;
		m.print();
		
	}

}
