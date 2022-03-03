import java.util.Scanner;
public class Chapter2ProgrammingChallenge13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double mealCharge;
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the charge for your meal?");
		mealCharge = kb.nextDouble();
		System.out.printf("The meal charge is $%.2f.\n", mealCharge);
		System.out.printf("The tax amount is $%.2f.\n", mealCharge*0.0675);
		System.out.printf("The tip amount is $%.2f.\n", mealCharge*0.2);
		System.out.printf("The total bill is $%.2f.\n", mealCharge+mealCharge*0.0675+mealCharge*0.2);
		kb.close();
	}

}
