import java.util.Scanner;
public class DecisionStructuresLeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter in a year.");
		year = kb.nextInt();
		if (year%4 != 0) {
			System.out.println("This is a common year"
					+ " not divisible by 4.");
		}
		else if (year%100 != 0) {
			System.out.println("This is a leap year"
					+ " not divisible by 100.");
		}
		else if (year%400 != 0) {
			System.out.println("This is a common year"
					+ " not divisble by 400.");
		}
		else
			System.out.println("This is a leap year.");
		kb.close();
	}

}
