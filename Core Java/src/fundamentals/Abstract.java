package fundamentals;

abstract class Parent {
	abstract void spend_money();
	
	void display() {
		System.out.println("Parent Method");
	}
}

class child1 extends Parent {
	void spend_money() {
		System.out.println("Saving money");
	}
}

class child2 extends Parent {
	void spend_money() {
		System.out.println("Spending money");
	}
	
}

public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		child1 c1 = new child1();
//		c1.spend_money();
		child2 c2 = new child2();
		c2.spend_money();
	}

}
