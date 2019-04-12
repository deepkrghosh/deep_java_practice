package deep_practice_package;

//Abstract class must have abstract methods & Non abstract methods
// This is the parent class 
abstract class x {
	abstract void disp(); // Abstract method has no body
	
	void display()
	{
		System.out.println("Method in abstract class x");
	}
}

// This is child class
 class y extends x {
	void disp() // this is the same class that is present in abstract method above & its NOW OVERRIDDEN
	{
		System.out.println("Method in normal class y");
	}
}

public class absClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		y obj = new y();
		obj.disp(); // Overridden method will be displayed here from Child class
		obj.display(); // 
		

	}

}
