

import java.util.Timer;
import java.util.TimerTask;

class Helper extends TimerTask
{
	
	int i =0;
	String str1= "onkar\b\b wagh";
	
	
	public void run()	
	{
		System.out.print(str1.charAt(i));
		i++;
			
	}
	
}

public class tryy {

	public static void main(String args[])
	{
		String str = "325";
		int n = Integer.parseInt(str);
		System.out.println(n);
		Timer timer= new Timer();
		TimerTask tt = new Helper();
		
		timer.schedule(tt, 2000, 2000);
		
	}
}
