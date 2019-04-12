package deep_practice_package;

//Parent Class starts here
class SuperClass { 
	int x = 10;
	void disp()
	{
		System.out.println("Super Class X " +x);
	}
}
//Parent Class ends here

//Child class extending its parent class
 class SubClass extends  SuperClass{
	 int y =20;
	 void disp()
	 {
		 System.out.println("Super Class X " +x);
		 System.out.println("Sub Class Y " +y);
	 }
 }

 class methodOverriding {

	public static void main(String[] args) {
		SubClass obj = new SubClass();
		obj.disp();

	}

}
