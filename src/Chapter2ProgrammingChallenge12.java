import java.util.Scanner;
public class Chapter2ProgrammingChallenge12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String favouriteCity;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is your favourite city?");
		favouriteCity = keyboard.nextLine();
		System.out.println("Number of characters in the city name: " + favouriteCity.length());
		System.out.println("Name of the city in all uppercase: " + favouriteCity.toUpperCase());
		System.out.println("Name of the city in all lowercase: " + favouriteCity.toLowerCase());
		System.out.println("First character in the name of the city: " + favouriteCity.charAt(0));
		keyboard.close();
	}

}
