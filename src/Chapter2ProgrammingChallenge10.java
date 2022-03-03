import java.util.Scanner;

public class Chapter2ProgrammingChallenge10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int europeanBeeEggProduction, africanBeeEggProduction;
		double meanEggProduction;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many eggs do European bees produce in a week?");
		europeanBeeEggProduction = keyboard.nextInt();
		System.out.println("How many eggs do African bees produce in a week?");
		africanBeeEggProduction = keyboard.nextInt();
		meanEggProduction = (double)(europeanBeeEggProduction+africanBeeEggProduction)/2;
		keyboard.close();
		System.out.println("The mean eggs produces by any bees within a week is " + meanEggProduction + " per week.");
	}

}
