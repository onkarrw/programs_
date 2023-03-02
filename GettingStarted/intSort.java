
public class intSort {

	public static void main(String[] args) {
	
		
		int count = 5;
		
		int[] arr = {12,56,33,6,9};	
//		int a[]=new int[5];
		
		
		for (int i=0; i<5; i++)
		{
			for (int j=i+1; j<5; j++)
			{
				if(arr[i] > arr[j])
				{
					
				
					int temp;
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				
				}
			}
		}
		
		
		for (int i=0; i<5; i++)
		{
			System.out.println(arr[i] + " ");
		}
		
		
		
	}

}
