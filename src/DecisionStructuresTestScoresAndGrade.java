import java.util.Scanner;
public class DecisionStructuresTestScoresAndGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int testScore1, testScore2, testScore3, meanScore;
		char letterGrade;
		System.out.println("What is your first test score?");
		testScore1 = kb.nextInt();
		System.out.println("What is your second test score?");
		testScore2 = kb.nextInt();
		System.out.println("What is your third test score?");
		testScore3 = kb.nextInt();
		meanScore = (testScore1+testScore2+testScore3)/3;
		if (meanScore > 89) {
			letterGrade = 'A';
		}
		else if (meanScore > 79) {
			letterGrade = 'B';
		}
		else if (meanScore > 69) {
			letterGrade = 'C';
		}
		else if (meanScore > 59) {
			letterGrade = 'D';
		}
		else
			letterGrade = 'F';
		System.out.printf("Your mean score is %d and your grade is %c.\n", meanScore , letterGrade);
		kb.close();
	}

}
