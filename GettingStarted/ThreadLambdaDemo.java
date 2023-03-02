
//REFER ThreadingDemo.java
/*
 

public class ThreadLambdaDemo {

	public static void main(String[] args) {

		Runnable obj1 = () ->	//Using lambda function
		{	
				for (int i=0; i<5; i++)
				{
					System.out.println("HII");
					try	{Thread.sleep(500); } catch(Exception e) {};
				}
		};
				
					
				
		Runnable obj2 = new Runnable()		//Anonymous class
				{
					public void run()
					{
						for (int i=0; i<5; i++)
						{
							System.out.println("HELLO");
							try	{Thread.sleep(500); } catch(Exception e) {};
						}
					}
				
				};
				
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		
		
		t1.start();

		try {Thread.sleep(200); } catch(Exception e) {}
		t2.start();
				
		

	}

}

*/



public class ThreadLambdaDemo {

	public static void main(String[] args) {

	
					
				
		Runnable obj2 = new Runnable()		//Anonymous class
				{
					public void run()
					{
						for (int i=0; i<5; i++)
						{
							System.out.println("HELLO");
							try	{Thread.sleep(500); } catch(Exception e) {};
						}
					}
				
				};
				
		
		Thread t1 = new Thread(() ->	//Using lambda function
		{	
			for (int i=0; i<5; i++)
			{
				System.out.println("HII");
				try	{Thread.sleep(500); } catch(Exception e) {};
			}
	});
		
		
		Thread t2 = new Thread(obj2);
		
		
		
		t1.start();

		try {Thread.sleep(200); } catch(Exception e) {}
		t2.start();
				
		

	}

}

