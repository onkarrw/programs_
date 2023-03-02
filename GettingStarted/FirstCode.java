import java.util.*;
public class FirstCode {
	
	public static void main(String args[])
	{
		int abc=88;		//size = y bytes	
		System.out.println("hello World");
		System.out.println(6);
		System.out.println(abc);
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a num:");
		int a = sc.nextInt();

		
		Scanner sc1 = new Scanner(System.in);

		System.out.println("Enter a num:");
		float b = sc1.nextFloat();

		char e = sc1.next().charAt(0);
		
		System.out.println("char is " + e);
		
		Scanner scc = new Scanner(System.in);

		System.out.println("Enter a String:");
		String str = scc.nextLine();
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Your entered string is "+ str);
		
	}

}
