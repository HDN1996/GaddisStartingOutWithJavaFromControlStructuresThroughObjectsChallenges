
public class Chapter2ProgrammingChallenge16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int CUSTOMERS = 12467;
		final double CUSTOMER_PERCENTAGE=0.14;
		final double CITRUS_PERCENTAGE=0.64;
		System.out.printf("The approximate number of customers who purchase one or more energy drinks per "
				+ "week is %.0f.\n", CUSTOMERS*CUSTOMER_PERCENTAGE);
		System.out.printf("The approximate number of customers who prefer citrus-flavoured energy drinks is"
				+ " %.0f.\n", CUSTOMERS*CUSTOMER_PERCENTAGE*CITRUS_PERCENTAGE);
	}

}
