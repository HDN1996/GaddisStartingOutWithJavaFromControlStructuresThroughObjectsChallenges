import java.util.Scanner;
public class LoopsAndFilesDistanceTraveled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int milesPerHour, timeTravelled;
		do {
			System.out.println("What is the miles per hour of the vehicle? Only enter in a value greater or equal to zero.");
			milesPerHour = kb.nextInt();
		} while (milesPerHour < 0);
		do {
			System.out.println("What number of hours have you travelled? Only enter in a value equal to at least 1.");
			timeTravelled = kb.nextInt();
		} while (timeTravelled < 1);
		System.out.printf("%-10s %-10s\n", "Hours", "Miles Travelled");
		System.out.println("--------------------------");
		for (int i=0; i< timeTravelled; i++) {
			System.out.printf("%-10s %-10s\n", i+1, (i+1)*milesPerHour);
		}
		kb.close();
		System.exit(0);
	}

}
