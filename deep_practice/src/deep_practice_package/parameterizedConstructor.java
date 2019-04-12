package deep_practice_package;

public class parameterizedConstructor {

	int id;
	String name;
	
	parameterizedConstructor(int idd, String nameName){
		id = idd;
		name = nameName;
	}
	
	public void display(){
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) {
		parameterizedConstructor pc1 = new parameterizedConstructor(1,"Deep");
		parameterizedConstructor pc2 = new parameterizedConstructor(2,"Madhu");
		pc1.display();
		pc2.display();

	}

}
