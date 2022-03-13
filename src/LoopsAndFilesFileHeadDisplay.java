import java.util.Scanner;
import java.io.*;
public class LoopsAndFilesFileHeadDisplay {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String filename;// terminalDisplay;
		Scanner kb = new Scanner(System.in);
		Scanner fileScanner, lineCounter;
		boolean fileExistence = false;
		/**
		 * Declare an instance of File object. Pass user-given string as an argument to the File constructor, assign
		 * a new reference to the instance.
		 */
		do {
			System.out.println("Enter in the name of a file that actually exists.");
			filename=kb.nextLine();
			File file = new File(filename);
			fileExistence = file.exists();
			lineCounter = new Scanner(file);
			fileScanner = new Scanner(file);
		} while (!fileExistence); // "File cannot be resolved." Can read objects within blocks?
		// Check how many lines there are, if there are less than five, read them all, if there are five or more, read only
		// five. Or check for the total number of lines, assign this as the condition x, else assign 5.
		int x=0;
		while (lineCounter.hasNext()) {
			x++;
			lineCounter.nextLine();
		}
		if (x>=5) {
			x=5;
		}
		// How do we return the read position to the beginning;
		//fileScanner.reset();// Let's try the reset method. No, it doesn't work that way.
		for (int i=0;i<x;i++) {
			System.out.println(fileScanner.nextLine());
		}
		fileScanner.close();
		lineCounter.close();
		kb.close();
		// Brutal and clumsy, but "it werks!"
		System.exit(0);
	}

}
