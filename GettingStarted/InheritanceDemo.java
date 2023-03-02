//java don't support multiple inheritance 
//only supports single or multilevel
class Calci		//super, parent
{
	Calci()
	{
		System.out.println(23+"\n");
	}
	public int add(int i, int j)
	{
		return i+j;
	}
	
}

class Calci2 extends Calci	//son, child
{
	Calci2()
	{
		System.out.println(24+"\n");
	}
	public int multiply(int i, int j){
		return i*j;
		
	}
}

public class InheritanceDemo {

	public static void main(String[] args)
	{
		Calci2 obj = new Calci2();
		
		System.out.println("sum is "+ obj.add(4,7));	//accessing members of another class// inheritance
		

		System.out.println("multiplication is "+ obj.multiply(4,7));
		
				
	}
}
