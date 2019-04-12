package deep_basic_practice;

class animal {
	public void run(){
		System.out.println("animals can run");
	}
}
class dog extends animal {
	public void bark(){
		System.out.println("Dogs can bark");
	}
}




public class inheritanceExample {

		public static void main(String[] args) {
			dog d = new dog();
			d.run();
			d.bark();
	}

}
