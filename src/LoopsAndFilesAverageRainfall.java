import java.util.Scanner;
public class LoopsAndFilesAverageRainfall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declarations
		Scanner kb = new Scanner(System.in);
		int years;
		double rainfall, totalRainfall, meanRainfall;
		do {
			System.out.println("Do not enter in an amount of years smaller than 0. What are the number of years?");
			years = kb.nextInt();
		} while (years < 1);
		totalRainfall = 0;
		for (int i=0; i< years; i++) {
			for (int j=0; j<12; j++) {
				do {
					System.out.printf("Do not enter in negative rainfall. How much rain has fallen for month %d of"
							+ " year %d?\n"
							,j+1 ,i+1);
					rainfall = kb.nextDouble();
				} while (rainfall < 0);
				totalRainfall += rainfall;
			}
		}
		meanRainfall = totalRainfall/(years*12);
		System.out.printf("Total months: %d\nTotal inches of rainfall: %.2f\n"
				+ "Average rainfall per month: %.2f\n", years*12, totalRainfall, meanRainfall);
		kb.close();
		System.exit(0);
	}

}
