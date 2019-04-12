package deep_basic_practice;

abstract class abstractClassExample1 {
	
	abstract void disp();
	
	void display() {
		System.out.println("inside abstract class");
	}
	
}

class childClass extends abstractClassExample1 {
	void disp(){
		System.out.println("inside Child class");
	}
}

public class abstractClassExample {
	public static void main(String[] args) {
		childClass obj = new childClass();
		obj.disp();
		obj.display();
	}
}