import java.util.Scanner;
public class DecisionStructuresBookClubPoints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int books, points;
		System.out.println("What number of books have you purchased this month?");
		books = kb.nextInt();
		if (books >=4)
			points=60;
		else if (books==3)
			points=30;
		else if (books==2)
			points=15;
		else if (books==1)
			points=5;
		else
			points=0;
		System.out.printf("You get %d points this month!\n", points);
		kb.close();
		System.exit(0);
	}

}
