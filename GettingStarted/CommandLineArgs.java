
public class CommandLineArgs {

	public static void main(String[] args) {
	
		int ans=0;
		
		for(int i=0; i<args.length; i++)
			{
				try 
				{
					int n = Integer.parseInt(args[i]);
					ans += n;
				}
				catch(Exception e)
				{
					System.out.println("java is "+ args[i]);
				}
			 	
			}
		System.out.println("sum of numbers is" + ans);
			
		
		
	}

}
