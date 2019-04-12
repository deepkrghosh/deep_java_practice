package deep_basic_practice;

abstract class parent {
 abstract void ParentMethod();
 void print(){
	 System.out.println("Inside Abstract Parent Class");
 }
}

 class child extends parent {
	public void ParentMethod(){
		System.out.println("Hurray!! Inside Child Class Overridden"); // Overridden class of abstract
	}
}



public class abstractClassExample2 {

	public static void main(String[] args) {
		child objChild = new child();
		objChild.print();
		objChild.ParentMethod();

	}

}
