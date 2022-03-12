import java.util.Scanner;
public class DecisionStructuresBankCharges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int BASE_FEE=10;
		double checkFees, bankServiceFees;
		int numberOfChecks;
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the number of checks written for the month?");
		numberOfChecks=kb.nextInt();
		if (numberOfChecks >=60) {
			checkFees=0.04;
		}
		else if (numberOfChecks >=40) {
			checkFees=0.06;
		}
		else if (numberOfChecks >=20) {
			checkFees=0.08;
		}
		else {
			checkFees=0.10;
		}
		bankServiceFees = BASE_FEE + numberOfChecks*checkFees;
		System.out.printf("Your bank's service fees for the month are $%.2f.\n", bankServiceFees);
		kb.close();
		System.exit(0);
	}

}
