
public class primeNumber {

	public static void main(String[] args) {
		
		
		int n=0, num=2;
		while(n<50)
		{
			int comp = 0;
			for (int i=2; i<num; i++)
			{
				if(num%i == 0)
				{
					comp =1;
				}
				
				 
			}
			
			if (comp ==0)
			{
				System.out.println(num);
				n++;
				
			}
			
			num++;
		}
		
	}
	

}
