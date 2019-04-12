package deep_practice_package;

public class Method_overload {
	
//	int a;
//	int b;
//	double c;
// Same method declaration with different arguments	
	void multiply(int a,int b){
		System.out.println(a*b);
	}
	void multiply(int a, int b, double c){
		System.out.println(a*b*c);
	}

	public static void main(String[] args) {
 
		
		Method_overload over = new Method_overload();
		over.multiply(1, 2);
		over.multiply(5, 4, 3.5);
		

	}

}
