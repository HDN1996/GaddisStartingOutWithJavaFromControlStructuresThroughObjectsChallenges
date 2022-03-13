
public class LoopsAndFilesPressureUnitConversions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%-8s %-8s\n", "Torrs", "KiloPascals");
		for (int i=0; i<10;i++) {
			System.out.printf("%-8d %-8.2f\n",i+1, (double)(i+1)*132/1000); //Justified font flag is placed before the decimal
			// and string conversion specifiers
		}
	}

}
