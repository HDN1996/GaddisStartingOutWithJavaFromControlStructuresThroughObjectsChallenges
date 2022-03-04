import java.util.Scanner;
public class Chapter2ProgrammingChallenge18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		
		String petName, animal, profession, university, city, name;
		int age;
		
		System.out.println("What is your name?");
		name = kb.nextLine();
		System.out.println("What is your age?");
		age = kb.nextInt();
		kb.nextLine(); //Consume newline.
		System.out.println("What city do you live in?");
		city = kb.nextLine();
		System.out.println("What university do you attend?");
		university = kb.nextLine();
		System.out.println("What is your profession?");
		profession = kb.nextLine();
		System.out.println("What animal is your pet?");
		animal = kb.nextLine();
		System.out.println("What is your pet's name?");
		petName = kb.nextLine();
		System.out.printf("There once was a person named " + name + " who lived in " + city + "."
				+ " At the age of " + age + ", " + name + " went to uni at " + university + ". "
						+ name + " graduated and went to work as a " + profession + ". Then, " + name + " adopted a(n) "
						+ animal + " named " + petName + ". They both lived happily ever after.");
		kb.close();
	}

}
