
public class Chapter2ProgrammingChallenge19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int SHARES_PURCHASED = 1000;
		final double PAY_PER_SHARE = 32.87;
		final double COMMISSION = 0.02;
		
		final int SHARES_SOLD = 1000;
		final double SOLD_PER_SHARE = 33.92;
		final double ANOTHER_COMMISSION = 0.02;
		System.out.printf("Joe paid $%.2f for the stock.\n", SHARES_PURCHASED*PAY_PER_SHARE);
		System.out.printf("Joe paid $%.2f as commission for the broker.\n", SHARES_PURCHASED*PAY_PER_SHARE*COMMISSION);
		System.out.printf("Joe sold the stock for $%.2f.\n", SHARES_SOLD*SOLD_PER_SHARE);
		System.out.printf("Joe paid his broker $%.2f in commission when he sold the stock.\n", SHARES_SOLD*SOLD_PER_SHARE*ANOTHER_COMMISSION);
		System.out.printf("Joe made $%.2f in profit after selling his stock and paying the two commissions to his broker.", 
				(SHARES_PURCHASED*PAY_PER_SHARE*COMMISSION)-(SHARES_SOLD*SOLD_PER_SHARE*ANOTHER_COMMISSION));
	}

}
