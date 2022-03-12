import java.util.Scanner;
public class LoopsAndFilesUnicodeCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char unicodeValue;
		Scanner kb = new Scanner(System.in);
		do {
			System.out.println("Enter in a Unicode decimal value in the range of 65-90 or 97-122 only.");
			unicodeValue=(char)kb.nextInt();
			System.out.println(unicodeValue);
		} while (unicodeValue < 65||unicodeValue > 122|| (unicodeValue >91 && unicodeValue<97));
		kb.close();
		System.exit(0);
	}

}
