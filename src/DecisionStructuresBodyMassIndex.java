import java.util.Scanner;
public class DecisionStructuresBodyMassIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		double height, mass, bmi;
		System.out.println("What is your height in metres?");
		height = kb.nextDouble();
		System.out.println("What is your mass?");
		mass = kb.nextDouble();
		bmi = mass/Math.pow(height, 2);
		System.out.printf("Your BMI is %.2f.\n", bmi);
		if (bmi > 25) {
			System.out.println("You are overweight.");
		}
		else if (bmi > 18.5) {
			System.out.println("You are of optimal mass.");
		}
		else {
			System.out.println("You are underweight.");
		}
		kb.close();
	}

}
