package deep_practice_package;

class sup 
{
	int no;
	void message() {
		System.out.println("Number in Super Class " +no);
	}
}

class sub extends sup
{
	int no;
	sub(int a, int b) {
		super.no = a;
		no = b;
	}
	void message() {
		System.out.println("Number in Sub Class " +no);
	}
	
	void disp() {
		super.message();
		message();
	}
}

public class AccessingSuperClassMembers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sub obj = new sub(100,200);
		obj.disp();

	}

}
