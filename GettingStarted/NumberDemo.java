
//classes Integer, float, double extends Number

class Printer
{
	public void show(Number i)
	{
		System.out.println(i);
	}
}


public class NumberDemo {

	public static void main(String[] args) {

		Printer obj = new Printer();
		
		obj.show(7);
		obj.show(7f);
		obj.show(76.7);
		
		Number i =879.7;
		System.out.println(i);

	}

}
