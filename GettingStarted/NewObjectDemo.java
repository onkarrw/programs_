
class Calc
{
	int num1;
	int num2; 
	int num3;
	int num4;
	
	public void perform()
	{
		num3 = num1 + num2 + num4;
	}
	
	Calc(int a, int b)
	{
		num1 = a;
		num2 = b;
	}
	
	Calc(int num1, int num2, int num4)
	{
		this.num1 = num1;
		this.num2 = num2;
		this.num4 = num4;
	}
	
	Calc(){}	//default constructor
}



public class NewObjectDemo {

	public static void main(String[] args) {
		
		Calc obj = new Calc();
		
		obj.num1 = 5;
		obj.num2 = 7;
		
		obj.perform();
		
		System.out.println(obj.num3);
		
		Calc obj2 = new Calc();
		
		obj2.num1 = 3;
		obj2.num2 = 8;
		
		obj2.perform();
		System.out.println(obj2.num3);
		
		
		Calc obj3 = new Calc();
		
		obj3.num1 = 12;
		
		obj3.num2 = obj.num1 + obj2.num2;
		
		System.out.println(obj3.num2);
		
		Calc obj4 = new Calc(11,22);
		obj4.perform();
		System.out.println(obj4.num3);
		
		

		Calc obj5 = new Calc(11,22,33);
		obj5.perform();
		System.out.println(obj5.num3);
	

	}
	
			}


