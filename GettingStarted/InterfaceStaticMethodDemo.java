
interface SDemo
{
	int num=8;		//becomes constant
	
	static int i = 15;
	
	public void abc();
	
	static void show()
	{
		System.out.println("hi");
	}
}

class SDemoImp implements SDemo
{
	public void abc()
	{
		System.out.println("in abc");
	}
	
	
}



public class InterfaceStaticMethodDemo {

	public static void main(String[] args) 
	{
		
		SDemo.show();			//static interface methods can be called without object creation
		System.out.println(SDemo.i);
		System.out.println(SDemo.num);		//but non-static variables can also be called without object creation
		
	}

}
