import java.util.Scanner;
public class LoopsAndFilesHotelOccupancy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int floors, roomsOnFloor, occupiedRooms, totalRooms, totalOccupied, totalVacant;
		double occupancyRate;
		Scanner kb = new Scanner(System.in);
		do {
			System.out.println("How many floors are there in the hotel? Enter in a value greater or equal to 1.");
			floors = kb.nextInt();
			int i=0;// Iterator.
			totalRooms = 0;
			totalOccupied = 0;
			totalVacant = 0;
			occupancyRate = 0;
			do {
				System.out.printf("How many rooms are there in floor %d? Enter in a value equal greater than"
						+ " or equal to 10.\n", i+1);
				roomsOnFloor = kb.nextInt(); // The condition is not checked until the end of the loop. At that point
				// the iterator would've added one anyways.
				if (roomsOnFloor >= 10) {
					totalRooms += roomsOnFloor;
					System.out.println("How many rooms on that floor are occupied?");
					occupiedRooms = kb.nextInt();
					totalOccupied += occupiedRooms;
					i++;
				}
			} while (roomsOnFloor < 10||i<floors);
		} while (floors<1);
		totalVacant = totalRooms - totalOccupied;
		occupancyRate= (double)totalOccupied/(double)totalRooms;
		System.out.printf("Number of rooms: %d\nNumber of rooms occupied: %d\n"
				+ "Number vacant: %d\nOccupancy rate: %%%.2f\n", totalRooms, totalOccupied, totalVacant, occupancyRate*100);
		kb.close();
		System.exit(0);
	}

}
