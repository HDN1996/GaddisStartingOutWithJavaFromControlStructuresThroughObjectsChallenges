import java.util.Scanner;
public class DecisionStructuresSoftwareSales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int packages;
		final int PACKAGE_PRICE = 99;
		double discount;
		System.out.println("Enter in the number of packages purchased.");
		packages = kb.nextInt();
		if (packages >= 100) {
			discount = 0.5;
		}
		else if (packages >=50) {
			discount = 0.4;
		}
		else if (packages >=20) {
			discount = 0.3;
		}
		else if (packages >=10) {
			discount = 0.2;
		}
		else {
			discount = 0;
		}
		System.out.printf("The amount of the discount is $%.2f. The total "
				+ "amount of the purchase after the discount is $%.2f.\n", PACKAGE_PRICE*packages*discount
				, PACKAGE_PRICE*packages - PACKAGE_PRICE*packages*discount);
		kb.close();
	}

}
