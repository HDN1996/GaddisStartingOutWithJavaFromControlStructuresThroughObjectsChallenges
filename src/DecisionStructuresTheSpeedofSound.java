import java.util.Scanner;
public class DecisionStructuresTheSpeedofSound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input;
		int distance;
		Scanner kb = new Scanner(System.in);
		System.out.println("Input in 'air', 'water', or 'steel'.");
		input = kb.nextLine();
		if ( !(input.equals("air")||input.equals("water")||input.equals("steel")) ) {
			System.out.println("You didn't input in 'air', 'water' nor 'steel'.");
		}
		else {
			System.out.println("For what distance in feet will the sound wave travel?");
			distance = kb.nextInt();
			switch (input) {
			case "air":
				System.out.printf("It will take %.2f seconds for sound to travel through air for %d feet.\n", (double)distance/1100, distance);
				break;
			case "water":
				System.out.printf("It will take %.2f seconds for sound to travel through water for %d feet.\n", (double)distance/4900, distance);
				break;
			case "steel":
				System.out.printf("It will take %.2f seconds for sound to travel through water for %d feet.\n", (double)distance/16400, distance);
				break;
			default:
				break;
			}
		}
		kb.close();
	}

}
