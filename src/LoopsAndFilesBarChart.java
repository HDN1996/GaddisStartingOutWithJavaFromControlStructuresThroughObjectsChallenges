import java.util.Scanner;
public class LoopsAndFilesBarChart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int[] storeSales = new int[5];
		for (int i=0;i<5;i++) {
			System.out.printf("Enter today's sales for store %d.\n", i+1);
			storeSales[i]=kb.nextInt();
		}
		System.out.println("SALES BAR CHART");
		for (int i=0;i<5;i++) {
			System.out.printf("Store %d:", i+1);
			for (int j=0;j<storeSales[i]/100;j++) { //Variable not in scope? No, you called it "stores" with an s
				//instead of just "store"
				System.out.print("*");
			}
			System.out.print("\n");
		}
		kb.close();
		System.exit(0);
	}

}
