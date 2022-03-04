import java.util.Scanner;
public class Chapter2ProgrammingChallenge17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double CUPS_OF_SUGAR=1.5;
		final double CUP_OF_BUTTER=1;
		final double CUPS_OF_FLOUR=2.75;
		
		int cookies;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many cookies do you want to make?");
		cookies = keyboard.nextInt();
		System.out.printf("You will need %.2f cups of sugar, %.2f cups of butter and %.2f cups of flour.\n", cookies*CUPS_OF_SUGAR/48 
				, cookies*CUP_OF_BUTTER/48 , cookies*CUPS_OF_FLOUR/48);
		keyboard.close();
	}

}
