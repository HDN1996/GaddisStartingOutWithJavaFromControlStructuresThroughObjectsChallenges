import java.util.Scanner;
public class Chapter2ProgrammingChallenge9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double milesPerGallon;
		double miles;
		double gallonsUsed;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("How many miles have you driven?");
		miles = keyboard.nextDouble();
		System.out.println("How many gallons of gas have you used?");
		gallonsUsed = keyboard.nextDouble();
		milesPerGallon = miles/gallonsUsed;
		keyboard.close();
		System.out.println("Your car's miles per gallon is : " + milesPerGallon +  " .");
	}

}
