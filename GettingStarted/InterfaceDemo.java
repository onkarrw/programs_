
interface Abc
{
	public void show();
	
}

class implementor implements Abc
{
	
	public void show()
	{
		System.out.println("Anything...1");
	}
}

class implementor2 implements Abc
{
	public void show()
	{
		System.out.println("Anything...2");
	}
	
}

public class InterfaceDemo {

	public static void main(String[] args) {
		
		implementor obj = new implementor();
		obj.show();
		
		Abc obj1 = new implementor2();
		obj1.show();
		
	}

}
