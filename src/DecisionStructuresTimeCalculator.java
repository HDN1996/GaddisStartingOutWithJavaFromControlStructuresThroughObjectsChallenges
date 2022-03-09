import java.util.Scanner;
public class DecisionStructuresTimeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int SECONDS_PER_MINUTE=60; // Seconds in a minute.
		final int SECONDS_PER_HOUR=3600;
		final int SECONDS_PER_DAY=86400;
		int seconds;
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter in a number of seconds.");
		seconds = kb.nextInt();
		if (seconds >= SECONDS_PER_DAY) {
			System.out.printf("There are %d day(s) in your entered seconds.\n", seconds/SECONDS_PER_DAY);
		}
		else if (seconds >= SECONDS_PER_HOUR) {
			System.out.printf("There are %d hour(s) in your entered seconds.\n", seconds/SECONDS_PER_HOUR);
			}
		else {
			System.out.printf("There are %d minute(s) in your entered seconds.\n", seconds/SECONDS_PER_MINUTE);
		}
		kb.close();
		}

}
