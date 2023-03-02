
interface Demo
{
	public void abc();
	
	default void show()
	{
		System.out.println("Demo show...");
	}
}

 
interface MyDemo
{
	default void show()
	{
		System.out.println("MyDemo show...");
	}
	
	
}

//ambiguity causing because show method two interfaces which are implemented by 

class DemoImp implements Demo, MyDemo
{
	public void abc()
	{
		System.out.println("in abc method");
	}
	
	@Override
	
	public void show()
	{
		MyDemo.super.show();		//overriding Demo with MyDemo
	}
		
	
}



public class InterfaceAmbiguityDemo {
	
	
	public static void main(String args[])
	{
		
		DemoImp obj= new DemoImp();
		
		obj.abc();
		
		obj.show();
		
		
		
	}

}
