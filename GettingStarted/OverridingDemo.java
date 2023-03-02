/*

class Abcd
{	
	public void show()
	{
		System.out.println("showing in Abcd");
	}
}

class Pqrs extends Abcd
{
	@Override
	public void show()
	{
//		super.show();		
		System.out.println("showing in Pqrs");
	}
}

public class OverridingDemo {
	public static void main(String[] args) {
		Pqrs obj = new Pqrs();
		obj.show();
	}
}

*/


class Abcd
{	
	public void show()
	{
		System.out.println("showing in Abcd");
	}
}

class Pqrs extends Abcd
{
	
	public void show()
	{
//		super.show();		
		System.out.println("showing in Pqrs");
	}
	
	public void show1()
	{	
		System.out.println("showing1 in Pqrs");
	}
}

class Wxyz extends Pqrs
{
	public void show()
	{
//		super.show();
		System.out.println("showing in Wxyz");
	}
}

public class OverridingDemo {
	public static void main(String[] args) {
		Abcd obj = new Pqrs();		//which show to run, will be decided at RUN time || runtime polymorphism ||

		obj.show();
		
		obj = new Wxyz();
		obj.show();		//Dynamic method dispach
	}
	
	
	
}
