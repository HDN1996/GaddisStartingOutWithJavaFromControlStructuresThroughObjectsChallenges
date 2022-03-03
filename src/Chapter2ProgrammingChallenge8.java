import java.util.Scanner;
public class Chapter2ProgrammingChallenge8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cookiesEaten;
		final int CALORIES_PER_SERVING = 300;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many cookies did you eat?");
		cookiesEaten = keyboard.nextInt();
		System.out.println("You consumed " + CALORIES_PER_SERVING*cookiesEaten + " calories.");
		keyboard.close();
	}

}
