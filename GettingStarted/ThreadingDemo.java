
class Hi extends Thread
{
	public void run()
	{
		for (int i=0; i<50; i++)
		{
			System.out.println("HI");
			try	{Thread.sleep(500); } catch(Exception e) {}; 
		}
		
	}
	
}

class Hello	extends Thread
{
	public void run()
	{
		for (int i=0; i<50; i++)
		{
			System.out.println("HELLO");
			try	{Thread.sleep(500); } catch(Exception e) {};
		}
		
	}
	
}

public class ThreadingDemo {

	public static void main(String[] args) {

		
		Hi obj1 = new Hi();
		
		Hello obj2 = new Hello();
		
//		obj1.show();
//		obj2.show();
		
		obj1.start();
//		try {Thread.sleep(200); } catch(Exception e) {}
		obj2.start();
				
	}

}





/*


class Hi implements Runnable
{
	public void run()
	{
		for (int i=0; i<500; i++)
		{
			System.out.println(i);
//			try	{Thread.sleep(500); } catch(Exception e) {}; 
		}
		
	}
	
}

class Hello	implements Runnable
{
	public void run()
	{
		for (int i=0; i<500; i++)
		{
			System.out.println(i);
//			try	{Thread.sleep(250); } catch(Exception e) {};
		}
		
	}
	
}

public class ThreadingDemo {

	public static void main(String[] args) {

		Runnable obj1 = new Hi();
//		Hi obj1 = new Hi();
		Hello obj2 = new Hello();
//		Runnable obj2 = new Hello();
	
		
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		
		
		t1.start();

//		try {Thread.sleep(200); } catch(Exception e) {}
		t2.start();

	}

}

*/

