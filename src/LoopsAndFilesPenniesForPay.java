import java.util.Scanner;
public class LoopsAndFilesPenniesForPay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int daysWorked;
		final double PENNIES = 0.01;
		Scanner kb = new Scanner(System.in);
		do {
			System.out.println("How many days will you work? Do not enter in zero nor a negative value.");
			daysWorked=kb.nextInt();
		} while (daysWorked <1);
		//Consume the new line.
		kb.nextLine();
		System.out.printf("%-10s %10s\n", "DAYS WORKED", "DOLLARS");
		System.out.println("--------------------------------------");
		// Supposed to be a geometric series doubling every day.
		// Pennies is the coefficient, the ratio is 2. The iterators i are the powers.
		// Do not forget newline escape in printf, nor the percentage formatting sign.
		// Do not correct the dollars with i+1, it is merely i.
		for (int i=0; i<daysWorked;i++) {
			System.out.printf("%-10d $%10.2f\n", (i+1), PENNIES*Math.pow(2, i));
		}
		kb.close();
		System.exit(0);
	}

}
