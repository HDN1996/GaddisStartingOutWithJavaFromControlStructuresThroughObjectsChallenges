import java.util.Scanner;
public class DecisionStructuresShippingCharges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double packageWeight, shippingCharge;
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter in the weight(pounds) of your package.");
		packageWeight = kb.nextDouble();
		if (packageWeight > 10) {
			shippingCharge = 3.8;
		}
		else if (packageWeight > 6) {
			shippingCharge = 3.7;
		}
		else if (packageWeight > 2) {
			shippingCharge = 2.2;
		}
		else {
			shippingCharge = 1.1;
		}
		System.out.printf("Your shipping rate per 500 miles is $%.2f.\n", shippingCharge);
		kb.close();
	}

}
