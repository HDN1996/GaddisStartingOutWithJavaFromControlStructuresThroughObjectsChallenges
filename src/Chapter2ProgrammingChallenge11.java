import java.util.Scanner;
public class Chapter2ProgrammingChallenge11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PENCIL_PRICE = 1.2;
		final double ERASER_PRICE = 2;
		final double COMPASS_PRICE = 5;
		
		int pencilsBought;
		int erasersBought;
		int compassesBought;
		
		double totalExpenditure;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("How many pencils did you buy?");
		pencilsBought = keyboard.nextInt();
		System.out.println("How many erasers did you buy?");
		erasersBought = keyboard.nextInt();
		System.out.println("How many compasses did you buy?");
		compassesBought = keyboard.nextInt();
		
		totalExpenditure = (double)(pencilsBought*PENCIL_PRICE) + (double)(erasersBought*ERASER_PRICE) + (double)(compassesBought*COMPASS_PRICE);
		System.out.printf("Your total expenditure is $%.2f.", totalExpenditure);
		keyboard.close();
	}

}
