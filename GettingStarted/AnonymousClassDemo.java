class First
{
	public void show()
	{
		System.out.println("In a Show...");
	}
	
	public void dontshow()
	{

		System.out.println("In a DontShow...");
	
	}
};

public class AnonymousClassDemo {

	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		
		First obj = new First()		//defining a class without name at object creation to override the methods of class.	
									//the newly defined class called as anonymous class or inner anonymous class.
				{					//Anonymous class is exist only for that specific scope or specific object.
					public void show()
					{
						System.out.println("In a Anonymous Show...");
					}
				};
				
				obj.show();
				
				obj.dontshow();
				
				
			First obj2 = new First();
			
			obj2.show();
		
	}

}