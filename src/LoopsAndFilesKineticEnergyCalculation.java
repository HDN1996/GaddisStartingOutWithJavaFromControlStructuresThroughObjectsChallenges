import java.util.Scanner;
public class LoopsAndFilesKineticEnergyCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		double mass, velocity, energy;
		char desire;
		do {
			System.out.println("What is the given mass(kg)?");
			mass=kb.nextDouble();
			System.out.println ("What is the given velocity (metres per second)?");
			velocity=kb.nextDouble();
			System.out.println("Would you like to continue calculating? Enter y for yes and anything else for no.");
			desire=kb.next().charAt(0);
			energy=0.5*mass*Math.pow(velocity, 2);
			System.out.printf("The total energy is %.2f joules.\n", energy);
		} while (desire=='y'||desire=='Y');
		kb.close();
	}

}
