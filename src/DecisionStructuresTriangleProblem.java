import java.util.Scanner;
public class DecisionStructuresTriangleProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		final int EUCLIDEAN_TRIANGLE = 180;
		int angles[] = new int[3];
		System.out.println("Enter the values of three angles.");
		for (int i=0; i<3; i++) {
			System.out.printf("Enter the size of angle %d.\n", i+1);
			angles[i]=kb.nextInt();
		}
		if (angles[0]+angles[1]+angles[2] == EUCLIDEAN_TRIANGLE) {
			System.out.println("This triangle is possible.");
		}
		else {
			System.out.println("This is not a possible Euclidean triangle.");
		}
		kb.close();
	}

}
