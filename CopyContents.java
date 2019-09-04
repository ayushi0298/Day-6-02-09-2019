import java.io.FileReader;
import java.util.Scanner;
import java.io.*;

public class CopyContents {

	public static void main(String[] args) throws Exception {
		Scanner user = new Scanner(System.in);
		String mainFile, secondFile;

		System.out.print("Input File Name: ");
		mainFile = user.nextLine();
		System.out.print("Output File Name: ");
		secondFile = user.nextLine();

		FileReader f = new FileReader(mainFile);
		BufferedReader b = new BufferedReader(f);
		FileWriter fw = new FileWriter(secondFile);
		String read;
		while ((read = b.readLine()) != null) {
			
			fw.write(read);
		}
		user.close();
		f.close();
		b.close();
		fw.close();
		System.out.println("TRUE");

	}

}
