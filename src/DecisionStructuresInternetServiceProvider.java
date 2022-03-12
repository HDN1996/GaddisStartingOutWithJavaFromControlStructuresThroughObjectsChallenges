import java.util.Scanner;
public class DecisionStructuresInternetServiceProvider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String packageLetter;
		double monthlyBill;
		monthlyBill=0;
		int hoursUsed;
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the letter of the package you have purchased.");
		packageLetter = kb.nextLine();
		System.out.println("Enter the amount of hours you have used.");
		hoursUsed = kb.nextInt();
		switch (packageLetter) {
			case "A":
			case "a":
				if (hoursUsed > 10) {
					monthlyBill = 9.95 + (hoursUsed-10)*2;
				}
				else {
					monthlyBill = 9.95;
				}
				break;
			case "B":
			case "b":
				if (hoursUsed > 20) {
					monthlyBill = 13.95 + (hoursUsed-20)*1;
				}
				else {
					monthlyBill=13.95;
				}
				break;
			case "C":
			case "c":
				monthlyBill=19.95;
				break;
			default:
				System.out.println("You entered an invalid package letter.");
				System.exit(1);
				break;
		}
		System.out.printf("Your total charge is $%.2f.\n", monthlyBill);
		kb.close();
	}

}
