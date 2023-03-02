//we can access private variables through public method methods only, idea is called encapsulation.
//getters and setters are used for this. cause we can login options for methods so it will be safe
//another advantage is we can mantain log file for variables change.
//they are so famous that eclipse do this for us, just go
//right click --> sourse --> getters and setters
// also we can create constructors through this step/method
	

class Student
{
	private int rollno;
	private String name;
	
	
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
public class EncapsulationDemo {

	public static void main(String[] args) {
		
		Student obj = new Student();
		obj.setRollno(5);
		System.out.print(obj.getRollno());
		
		
	}

	

	

}
