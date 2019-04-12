package deep_practice_package;

public class Studentroll {
	
	int roll; // instance variable created
	String stuname; // Another instance variable

	void record_entry(int r, String s){
		roll=r;
		stuname=s;
	}
	
	void print_record(){System.out.println(roll+ " "+stuname);}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studentroll obj1= new Studentroll();
		Studentroll obj2= new Studentroll();
		
		obj1.record_entry(152108,"CTS");
	    obj2.record_entry(4289, "IBM");
//		obj1.record_entry(4289, "IBM");
//		obj2.record_entry();
		
		obj1.print_record();
		obj2.print_record();
		
		
		
		

	}

}
