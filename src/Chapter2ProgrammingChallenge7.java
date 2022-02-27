import java.util.Scanner;
public class Chapter2ProgrammingChallenge7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double STATE_SALES_TAX = 0.04;
		final double COUNTY_SALES_TAX = 0.02;
		double purchase;
		purchase = 0.0;
		System.out.println("What is the amount of the purchase?");
		Scanner kb = new Scanner(System.in);
		purchase = kb.nextDouble();
		System.out.println("Purchase: $" + purchase + "\nState sales tax:$" +
		STATE_SALES_TAX * purchase + "\nCounty sales tax: $" + COUNTY_SALES_TAX * purchase + "\nTotal sales tax: $"
				+ (STATE_SALES_TAX+COUNTY_SALES_TAX) * purchase + "\nTotal sale: $" + ((STATE_SALES_TAX+COUNTY_SALES_TAX)* purchase + purchase));
		kb.close();
	}

}
