package deep_practice_package;


//Defining class
class student {
	int m1,m2;
	void getMarks(int x, int y) {
		m1 = x;
		m2 = y;
	}
	
	void putMarks() {
		System.out.println("First " +m1);
		System.out.println("Second " +m2);
	}
}


//Defining Interface
interface sport {
	int sp = 6;
	void spMarks();
	
}

// defining multiple inheritance using Interface
class result extends student implements sport {
	public void spMarks() {
		System.out.println("Sports Marks " + sp);
	}
	void disp() {
		putMarks();
		spMarks();
		int total = m1 + m2 + sp;
		System.out.println("Total Marks " +total);
	}
}

public class MultipleInheritanceUsingInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		result obj = new result();
		obj.getMarks(90,75);
		obj.disp();

	}

}
