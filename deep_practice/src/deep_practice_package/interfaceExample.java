package deep_practice_package;

interface A
{
	int roll = 101;
	void dispa();
}

interface B
{
	void dispb();
}

 class c implements A,B
{
	public void dispa()
	{
		System.out.println("Method from A Interface");
	}
	public void dispb()
	{
		System.out.println("Method from B Interface");
	}
}


public class interfaceExample {

	public static void main(String[] args) {

		
		c obj = new c();
		obj.dispa();
		obj.dispb();
		System.out.println(obj.roll);

	}

}
