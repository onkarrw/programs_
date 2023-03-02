
 
 /*
// Normal method 
// After creating object with parameters subClass parameterized constructor will be called but super class default constructor will be called.
// This is because all classes have super method which have no parameters by default.
// But when we give parameters to super method it will call parameterized constructor of super class.
class A
{
	public A()
	{
		System.out.println("This is class A default constructor.");
	}	
	public A(int i)
	{
		System.out.println("This is class A parameterized constructor...");
	}
}

class B extends A
{
	
	public B()
	{
		super();		//this is default, we dont need to write it. It will call default contructor of super class, but when we give parameters here it will call parameterized constructor of super class
		System.out.println("This is class B default constructor.");
	}
	
	public B(int i)
	{	
		
		System.out.println("This is class B parameterized constructor...");
	}
}

public class SuperDemo {

	public static void main(String[] args) {
		
		
		B obj = new B();
		System.out.println("	........				");
		B obj1 = new B(6);
	}
}



//Super method
class A
{
	public A()
	{	
		System.out.println("This is class A default constructor.");
	}	
	public A(int i)
	{
		System.out.println("This is class A parameterized constructor...");
	}
}

class B extends A
{
	public B()
	{
		super();
		System.out.println("This is class B default constructor.");
	}
	public B(int i)
	{	super(i);		//super always lied on upper side of class definition.
		System.out.println("This is class B parameterized constructor...");
	}
}

public class SuperDemo {

	public static void main(String[] args) {
		
	B obj = new B(6);
	
	}
}

*/


/*
class A
{
	int i;
	public void show()
	{
		System.out.println("In A");
	}
	public void show1()
	{
		System.out.println("In A 1");
		
	}
	
}

class B extends A
{
	
	int i;

		@Override		//gives error if method not found for overriding.
	public void show()
	{
		
		i=8;
		super.i = 9;
		System.out.println("In B");
		
	}
	
	public void show1()
	
	{
		
		super.show1();			//Also calls super class function
		System.out.println("In B 1");
		
	}
	
}

public class SuperDemo {

	public static void main(String[] args) {
		
	B obj = new B();
	obj.show();
	obj.show1();
	
	}
}


*/
