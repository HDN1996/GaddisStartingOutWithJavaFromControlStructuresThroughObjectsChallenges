import java.util.Scanner;
import java.io.*;
public class LoopsAndFilesLineNumbers {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		String filename;
		File pathname;
		do {
			System.out.println("Enter in the name of a file that actually exists.");
			filename=kb.nextLine();
			pathname= new File(filename);// This variable is confined to the block?
		} while (!pathname.exists());
		/**
		 * Now in a while loop that terminates when is no longer any lines, count the lines, number each of them
		 * display the contents in the terminal and follow it with a colon, keeping in mind that numbering should
		 * start at one. 
		 */
		int i =0;
		Scanner fileScanner = new Scanner(pathname);// Why are you passing filename, it should be pathname!
		String scannerString;
		while (fileScanner.hasNext()) {
			scannerString=fileScanner.nextLine();
			System.out.printf("Line %4d %s %s\n", i+1, scannerString, ":"); // Outputs "1 Distance File.txt :"?
			// Why is fileScanner.nextLine() identical to "Distance File.txt"?
			// No incrementing of i!
			i++;
		}
		kb.close(); // Close kb here?
		fileScanner.close();
		System.exit(0);
	}

}
