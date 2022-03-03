import java.util.Scanner;
public class Chapter2ProgrammingChallenge14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int males, females, totalStudents;
		double malesPercentage;
		double femalesPercentage;
		Scanner kb = new Scanner(System.in);
		System.out.println("How many males are in the class?");
		males = kb.nextInt();
		System.out.println("How many females are in the class?");
		females = kb.nextInt();
		totalStudents = males + females;
		malesPercentage = (((double)males)/totalStudents)*100;
		femalesPercentage = (((double)females)/totalStudents)*100;
		System.out.println("The percentage of male students is %" + malesPercentage + " and the percentage"
				+ " of female students is %" + femalesPercentage + ".");
		kb.close();
	}

}
