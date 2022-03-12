import java.util.Scanner;
public class LoopsAndFilesPopulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int startingNumber,numberOfDays;
		double meanPopulationIncreasePercentage;
		Scanner kb = new Scanner(System.in);
		do {
			System.out.println("Do not enter in a starting population smaller than 2. What is the starting"
					+ " number of organisms?");
			startingNumber=kb.nextInt();
		} while (startingNumber<2);
		do {
			System.out.println("Do not enter in a population growth percentage smaller than zero. What is the"
					+ " mean population growth rate in percentage?");
			meanPopulationIncreasePercentage = kb.nextDouble()/100;
		} while (meanPopulationIncreasePercentage<0);
		do {
			System.out.println("Do not enter in a total number of days less than 1. For what amount of days "
					+ "will they multiply?");
			numberOfDays=kb.nextInt();
		} while (numberOfDays < 1);
		/**
		 * This is a geometric series.
		 * */
		for (int i=0;i<numberOfDays;i++) {
			System.out.printf("%-10s: %d\n%-10s: %d\n\n","Day", i+1, "Population", (int)(startingNumber*Math.pow(1+meanPopulationIncreasePercentage
					, i)));
		}
		kb.close();
		System.exit(0);
	}

}
