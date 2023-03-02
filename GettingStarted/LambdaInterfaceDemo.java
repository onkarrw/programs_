//Types of interface
//1. Normal interface	- More than one abstract method in it
//2.Single abstract method / functional interface.	- single abstract method in it
//3.Marker interface	- no abstract method in it



//interface can have only abstract methods which cannot be defined within the class
//but after 1.8 we can define methods in interface with keyword default.



@FunctionalInterface	//its not showing error cause in c interface only one abstract method present else will show error
interface C
{
	public void show();
	
	default void abc()		//can be overriden in implementor class
	{
		System.out.println("in abc");
	}
	
	
}

//here C interface has only one method
//hence functional interface
//hence we can use lambda interface

public class LambdaInterfaceDemo {
	
	public static void main(String args[])
	{
		C obj = () -> {
							System.out.println("using lambda interface...");
							System.out.println("second line");
					  };
		
		obj.show();
		obj.abc();
	}

}
