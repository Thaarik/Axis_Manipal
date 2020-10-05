import java.util.Scanner;

public class ParticipantID {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean a = true;
		System.out.println("Enter the number of participants");
		int num = scan.nextInt();
		int[] id = new int[num];
		System.out.println("Enter the IDs");
		for (int i = 0; i < num; i++) {
			id[i] = scan.nextInt();
		}
		while (a) {
			System.out.println("Enter ID to search");
			int search = scan.nextInt();
			if (search != 0) {
				boolean found = false;
				for (int n : id) {
					if (n == search) {
						found = true;
						break;
					}
				}
				if (found) {
					System.out.println("Participant with ID " + search + " exists");
				} else {
					System.out.println("Participant with ID " + search + " does not exist");
				}
			} else {
				System.out.println("Program Terminated");
				a = false;
			}
		}

	}

}
