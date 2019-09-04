import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.SequenceInputStream;

public class MergeUsingSIS {

	public static void main(String[] args) throws Exception {
		File f1 = new File("C:\\Users\\Ayushi\\file.txt");
		File f2 = new File("C:\\Users\\Ayushi\\file1.txt");
		
		if (f1.isFile() && f2.isFile()) {
			FileInputStream file1 = new FileInputStream(f1);
			FileInputStream file2 = new FileInputStream(f2);
			FileOutputStream fos = new FileOutputStream("C:\\Users\\Ayushi\\file2.txt",true);
			SequenceInputStream sis = new SequenceInputStream(file1, file2);
			PrintStream ps = new PrintStream(fos);
			int ch;
			while ((ch = sis.read()) != -1) {
				fos.write(ch);
			}
			sis.close();
			file1.close();
			file2.close();
			fos.close();
			ps.close();
			System.out.println("Operation successfull");
		}
		else
		{
			System.out.println("File does not exist");
		}
		
	}

}