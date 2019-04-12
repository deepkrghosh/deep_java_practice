package deep_practice_package;

class Addition {
int x, y, c;
	void add(int a, int b){
		x = a;
		y = b;
		int c = x + y;
		System.out.println("Result: "+ c);
	}
//	public static void main(String ar[]){
//		Addition obj = new Addition();
//		obj.add(1, 2);
//	}


}

class Main {

	public static void main(String ar[]){
		Addition obj = new Addition();
		obj.add(1, 2);
	}
}