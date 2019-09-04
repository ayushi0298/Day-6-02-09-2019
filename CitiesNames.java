import java.util.Scanner;
import java.io.PrintStream;

public class CitiesNames {

	public static void main(String[] args) throws Exception {
		String inputFile = "C:\\Users\\Ayushi\\file1.txt"; 
		Scanner scanner = new Scanner(System.in); 
		System.out.println("DATA STORED");
		PrintStream ps=new PrintStream(inputFile);
		String x;
		while ((x= scanner.nextLine())!= null)   
		  {  
			if(x.trim().equalsIgnoreCase("done"))
			{
				System.exit(0);
			}
		    ps.println(x); 
		  }  
		ps.close();
		scanner.close();
	}
}
	

