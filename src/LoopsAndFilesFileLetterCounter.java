import java.util.Scanner;
import java.io.*;
public class LoopsAndFilesFileLetterCounter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String filename; // A string to store the entered filename.
		//String searchCharacter;
		Scanner kb = new Scanner(System.in);
		int sentinel = 0;
		/**
		 * Ask the user for the file name. Check if the file actually exists first.
		 */
		do {
			System.out.println("What is the filename? Enter in a filename that actually exists.");
			filename = kb.nextLine();
			File file = new File (filename); // Assign a new File object to instance file.
			if (!file.exists()) {
				sentinel = -1;
			}
			else {
				/**
				 * Within the text, no methods are provided to evaluate each and every character within itself,
				 * therefore remaining strictly true to the text, we should read each line as a string in itself
				 * with the string's length as a condition, repeat until every line has been read.
				 */
				Scanner inputFile = new Scanner(file); // Open the file to reading.
				System.out.println("What character would you like to count in the file?");
				char searchCharacter = kb.nextLine().charAt(0);
				int characterCount = 0;
				while (inputFile.hasNextLine()) { // Read if there is a line at all.
					String inputLine = inputFile.nextLine(); // Read that into its own line as its own string.
					for (int i=0;i<inputLine.length();i++) { // Read through each index of the string, which is an
						//array of characters.
						if (searchCharacter == inputLine.charAt(i)) { // See if searchCharacter condition is satisfied
							characterCount ++; // Count plus if so.
						}
					}
				}
				System.out.printf("The character occurs %d times.\n", characterCount);
				inputFile.close();
			}
		} while (sentinel == -1);
		kb.close();
		System.exit(0);
	}

}
