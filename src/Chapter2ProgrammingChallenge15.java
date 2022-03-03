public class Chapter2ProgrammingChallenge15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int SHARES_OF_STOCK = 600;
		final double PRICE_PER_SHARE = 21.77;
		final double COMMISSION_RATE = 0.02;
		System.out.printf("The amount paid for the stock alone is $%.2f.\n", (SHARES_OF_STOCK*PRICE_PER_SHARE));
		System.out.printf("The amount paid for the commission is $%.2f.\n", (COMMISSION_RATE * SHARES_OF_STOCK));
		System.out.printf("The total amount paid (for the stock plus the commission) is $%.2f.\n", (SHARES_OF_STOCK*PRICE_PER_SHARE + COMMISSION_RATE * SHARES_OF_STOCK));
	}

}
