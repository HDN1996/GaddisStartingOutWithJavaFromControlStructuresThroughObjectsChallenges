import java.util.Scanner;
public class DecisionStructuresFatGramCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double CALORIES_FROM_FAT_THRESHHOLD = 0.3;
		int caloriesFromFat, totalCalories, fatGrams;
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter in the number of calories in your food item.");
		totalCalories = kb.nextInt();
		System.out.println("Enter in the number of fat grams in your food item.");
		fatGrams = kb.nextInt();
		caloriesFromFat = fatGrams * 9;
		if (caloriesFromFat > totalCalories) {
			System.out.println("ERROR: Calories from fat cannot exceed total calories.");
		}
		else {
			System.out.printf("The percentage of calories from fat is %%%.2f.\n", ((double)caloriesFromFat/totalCalories)*100);
			if (caloriesFromFat < CALORIES_FROM_FAT_THRESHHOLD*totalCalories) {
				System.out.println("The food is low in fat.");
			}
		}
		kb.close();
	}

}
