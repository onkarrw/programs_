/*
class Outer
{
	int a;
	public void show()
	{
		System.out.println("In Show");
	}
	
	class Inner
	{
		public void display()
		{
			System.out.println("In display");
		}
	}	
}

public class InnerClassDemoCode {

	public static void main(String[] args) {

		Outer obj = new Outer();
		obj.a= 6;
		obj.show();
		
		Outer.Inner obj1 = obj.new Inner();
		
		obj1.display();
		
	}
}

*/

class Outer
{
	static int a;
	static public void show()
	{
		System.out.println("In Show");
	}
	
	static class Inner
	{
		public void display()
		{
			System.out.println("In display");
		}
	}
	
}

public class InnerClassDemoCode {

	public static void main(String[] args) {

//		Outer obj = new Outer();	//Don't need 'object' to call 'static members' of class
		Outer.a= 6;
		Outer.show();
		System.out.println("value of a is " + Outer.a + "  and also to concatenate "
				+ "the output printed on screen \'+\' sign is working...");
		Outer.Inner obj1 = new Outer.Inner();
		
		obj1.display();
		
	}

}

