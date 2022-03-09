import java.util.Scanner;
public class DecisionStructuresOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter in a number.");
		number = kb.nextInt();
		if ((number == 1)||(number%2!=0)||number == -1) {
			System.out.printf("%d is an odd number.\n", number);
		}
		kb.close();
	}

}
