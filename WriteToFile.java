

import java.io.FileWriter;   
import java.io.IOException;  

public class WriteToFile {

	public static void main(String[] args) {
		
		try 
		{
			FileWriter myWriter = new FileWriter("C:\\Users\\ONKAR WAGH\\Desktop\\Vids\\tet.txt");
		    myWriter.write("Files in Java might be tricky, but it is fun enough!");
		    myWriter.write("\nWe are enjoying file handling in JAVA!");
		    myWriter.write("\nThis is my first file handling program in JAVA!");
		    myWriter.close();
		    System.out.println("Successfully wrote to the file.");
		} 
		catch (IOException e) 
		{
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}