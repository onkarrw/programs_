
class Calcsum
{
	public void sum(int ... n)	//arguments treated as arrays, suppose array name is n
	{
		int sum =0;
		
		for (int i:n)	//first element in array in array goes as i value, then second element goes as i value, and continue.
		{
			System.out.println(i);
			sum = sum + i;
		}
		
		System.out.println(sum);
		
	}
	
	
	
}




public class VariableSizedArguments {

	public static void main(String[] args) {

		Calcsum obj = new Calcsum();
		obj.sum(4,8,9,6,9,9);

	}

}
