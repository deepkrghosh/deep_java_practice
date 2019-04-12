package deep_basic_practice;

public class methodOverloadingPractice {

	
	public void multiply(int a, int b){
		System.out.println(a*b);
	}
	
	public void multiply(int a, int b, int c){
		System.out.println(a*b*c);
	}
	public static void main(String[] args) {

		methodOverloadingPractice obj = new methodOverloadingPractice();
		obj.multiply(2,3);
		obj.multiply(1,4,5);
	}

}
