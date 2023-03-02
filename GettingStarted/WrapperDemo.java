
public class WrapperDemo {

	public static void main(String[] args) {

		int i=5;		//primitive data type
		 
		Integer ii = new Integer(5);	// Boxing - Wrapping
		
		int j = ii.intValue();		//unBoxing - unWrapping
		
		System.out.println(j);
		
		Integer v = 7;			//AutoBoxing
		System.out.println(v);
		
		int k = v;				//AutoUnBoxing
		
		System.out.println(v);
		
		System.out.println("...");
		
		String str = "456";
		int n = Integer.parseInt(str);
		System.out.println(n);
	}

}
