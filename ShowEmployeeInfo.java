import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ShowEmployeeInfo {
	public void showDetails()
	{
		System.out.println();
	}
	public static void main(String[] args) throws Exception {
		
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Ayushi\\file.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		oos.close(); 
		fos.close();

	}
	
}