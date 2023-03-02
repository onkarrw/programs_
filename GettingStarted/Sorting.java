
import java.util.Scanner;

public class Sorting {

		void sortInterger(int a[]) 
		{
			for (int i = 0; i < a.length; i++) 
			{
				for (int j = i + 1; j < a.length; j++) 
				{
					if (a[i] > a[j]) 
					{
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
		}

		void sortString(String str[]) 
		{
			String temp;
			
			for (int i = 0; i < str.length; i++) 
			{
				for (int j = i + 1; j < str.length; j++) 
				{
					if (str[i].compareToIgnoreCase(str[j]) > 0) 
					{
						temp = str[i];
						str[i] = str[j];
						str[j] = temp;
					}
				}
			}
		}

		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			Sorting obj = new Sorting();
			int choice;
					
			do {
				
				System.out.println(" \n\n 1.Sort Integer\n 2.Sort string\n 3.exit\n");
				
				System.out.println("Enter the choice");
				choice = sc.nextInt();

				switch (choice) 
				{

case 1:
					
					System.out.println("Enter the size of Array ");
					int n1 = sc.nextInt();

					System.out.println("Enter the Numbers :");
					int arr1[] = new int[n1];
					for (int i = 0; i < n1; i++)
					{
						arr1[i] = sc.nextInt();
					}
							
					obj.sortInterger(arr1);
							
					System.out.println("Sorted Numbers are :");
					for (int i = 0; i < n1; i++)
					{
						System.out.print(arr1[i] + " ");
					}
							
					break;

				case 2:
							
					System.out.println("Enter the size of Array ");
					int n2 = sc.nextInt();

					System.out.println("Enter the Strings :");
					String arr2[] = new String[n2];
					for (int i = 0; i < n2; i++)
					{
						arr2[i] = sc.next();
					}
											
					obj.sortString(arr2);
							
					System.out.println("Sorted strings are :");
					for (int i = 0; i < n2; i++)
					{
						System.out.print(arr2[i] + " ");
					}
							
					break;
				}
			} while (choice != 3);
		}
		
	}











