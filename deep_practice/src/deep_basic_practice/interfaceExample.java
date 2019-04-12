package deep_basic_practice;

interface A {
	int a = 100;
	 void dispA();
}

interface B {
	 void dispB();
	}

class c implements A,B {
	public void dispA(){
		System.out.println("inside dispA class C");
	}
	public void dispB(){
		System.out.println("inside dispB class C");
	}
}
public class interfaceExample {

	public static void main(String[] args) {
		c objC = new c();
		objC.dispA();
		objC.dispB();
		System.out.println(objC.a);

	}

}
