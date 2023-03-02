
interface Class1
{
	public void show();
	
}

//We have created interface therefore its implementor class is necessary. 
//But instead we can create anonymous class which will define interface methods.


public class InterfaceAnonymousClassDemo {
	
	public static void main(String args[])
	{
		
		Class1 obj = new Class1()
				{
					public void show()
					{
						System.out.println("In a Anoymous class...");
					}
					
				};
				
		obj.show();				
	}

}
