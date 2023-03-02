/*
public class Arrays {
	public static void main(String[] args) {
		int nums[] = new int[4];
		nums[0] = 5;
		nums[1] = 8;
		nums[2] = 4;
		nums[3] = 7;
//		System.out.println(nums[2]);
		for (int i=0; i<4;i++)
		{
			System.out.println(nums[i]);
		}
		int nums1[] = {3,7,8,3,4,1};
		}
}

public class Arrays {
	
	public static void main(String[] args) {
		//2D arrays
		
		int d[][] = {
				
				{3,6,7,1},
				{2,7,3,6},
				{1,0,3,5}
				
		};
		//printing 2D array
		for (int i=0; i<3; i++)
		{
			for (int j=0; j<4; j++)
			{
				System.out.print( d[i][j] + " ");
			}
			System.out.println();
		}
		
		
		System.out.println();System.out.println();
		}
}

//jagged arrays

public class Arrays {
	
	public static void main(String[] args) {
		//jagged arrays
		
		
		int arr[][]  = {
				{3,6,8,9},
				{1,5,8},
				{7,4,2,1,5}			
		};
		
		//finding row length
		for (int i=0; i<3; i++)
		{
			System.out.println(arr[i].length);
			
		}
		
		//printing jagged array
		
		for (int i=0; i<3; i++) 
		{
			for (int j=0; j<arr[i].length; j++)
			{
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
			
		}
				
		}
}


*/


public class Arrays {
	
	
	

	
	
	
	public static void main(String[] args) {
		
		
		System.out.println("printing 1-d array new method: ");
		
		
		int a[] = {4,6,7,3,1};
		
		for (int i:a)
		{
			System.out.print( " "+i );
		}
		System.out.println();
		
		System.out.println("printing 2-d array or jagged array new method: ");
		
		int d[][] = {
				
				{3,6,7,1},
				{2,7,3,6},
				{1,0,3}
				
		};
		
		for (int r[]:d)
		{
			for (int c:r)
			{
				System.out.print(c + " ");
			}
			System.out.println();
		}
		
		
		}
}



