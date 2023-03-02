
public class dectobin {
	
	public void dtb(int n)
	{
		if(n==0) return;
	
			int m = n%2;
			
			n = n/2;
		
		
			dtb(n);
			
			System.out.print(m);
			
			
	}
	
	public static int ans = 0;
	
	public static int mf = 1;
	
	public void btd(int n)
	{	
		
		if (n == 0) return;
		
		int rem = n% 10;
		n =  n/10;
		ans = ans + rem * mf;
		mf *=2;
		
		btd(n);
		
	}

	
	public static void main(String[] args)
			{
		
				dectobin db= new dectobin();
				int n = 3;
				int m = 1001;
				
				
				System.out.print("decimal to binary of " + n + "  is "  ); db.dtb(n);
				
				db.btd(m); System.out.println("\n\nbinary to decimal of " + m + "  is "  + db.ans);
				
				
				
			}
}
