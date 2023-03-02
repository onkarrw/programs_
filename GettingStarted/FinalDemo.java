/*
//final with methods

class A_of_FinalDemo
{
	
	public final void method()
	{
		System.out.println("method of A");
	}
}

class B_of_FinalDemo extends A_of_FinalDemo
{
	
//	public void method()		//cannot override method from super class
//	{
//		System.out.println("method of B");
//	}
}

public class FinalDemo {

	public static void main(String[] args) {
		
		B_of_FinalDemo obj = new B_of_FinalDemo();
		obj.method();
	}
}

*/


//final with variables

class A_of_FinalDemo
{
	int a;
	A_of_FinalDemo()
	{
		a = 6;
		a = 8;	//can reassign the value to a cause its not final
	}
}

class B_of_FinalDemo
{
	final int NUM;
	B_of_FinalDemo()
	{
		NUM = 6;
//		NUM = 8;	//gives error because final makes NUM constant
	}
}

public class FinalDemo {

	public static void main(String[] args) {
		
		
	}
}



/*


//final with class demo

final class A	//cannot be extended by any other class
{
	
}

class B extends A		// giving error
{
	
}

public class FinalDemo {

	public static void main(String[] args) {
		
	}
}

*/