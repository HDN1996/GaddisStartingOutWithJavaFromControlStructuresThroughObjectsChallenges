import java.util.Scanner;
public class DecisionStructuresMagicDates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int date, month, year;
		System.out.println("What is the month in numeric format?");
		date = kb.nextInt();
		System.out.println("What is the day of the month in numeric format?");
		month = kb.nextInt();
		System.out.println("What is the two digit year?");
		year = kb.nextInt();
		kb.close();
		if (date*month==year) {
			System.out.println("The date is magic.");
		} else {
			System.out.println("The date is not magic.");
		}
	}

}
