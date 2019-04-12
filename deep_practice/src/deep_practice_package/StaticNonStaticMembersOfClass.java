package deep_practice_package;

public class StaticNonStaticMembersOfClass {
	
	int i=20;
	static int j=30;
	//Non Static method
	public void test1() {
		System.out.println("NonStatic test1()");
		
	}
	//Non Static method
	public void test2() {
		System.out.println("NonStatic test2()");
		
	}
	// Static method
	public static void test3() {
		System.out.println("Static test3()");
		
	}
	

	public static void main(String[] args) {

		StaticNonStaticMembersOfClass obj = new StaticNonStaticMembersOfClass();
		obj.test1();
		obj.test2();
		obj.test3();
		
		

	}

}
