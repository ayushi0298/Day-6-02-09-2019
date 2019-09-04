import java.io.File;
import java.util.Scanner;

public class RenameFile {
	public static void main(String[] args) {

		Scanner user = new Scanner(System.in);
		String inputFileName, outputFileName;

		System.out.print("Input File Name: ");
		inputFileName = user.nextLine();
		System.out.print("Output File Name: ");
		outputFileName = user.nextLine();

		File f1 = new File(inputFileName);
		File f2 = new File(outputFileName);

		if (!f1.exists()) {
			System.out.println("DOES NOT EXISTS");
		}

		else if (!f1.isFile()) {

			System.out.println("NOT A FILE");
		}

		else if (f2.exists()) {
			System.out.println("FILE  ALREADY EXISTS");
		} else {
			long size = f1.length();
			if (size < 500) {

				if (f1.renameTo(f2)) {
					System.out.println("File name successfully changed");
				} else {
					System.out.println("operation failed");
				}
			}

			user.close();
		}
	}

}
