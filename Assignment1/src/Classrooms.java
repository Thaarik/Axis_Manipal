import java.util.Scanner;

public class Classrooms {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter C1 capacity");
		int c1 = scan.nextInt();
		System.out.println("Enter C2 capacity");
		int c2 = scan.nextInt();
		System.out.println("Enter C3 capacity");
		int c3 = scan.nextInt();
		System.out.println("Enter number of students");
		int nos= scan.nextInt();
		if(c1>=nos && c2>=nos && c3>=nos) {
			System.out.println("3 labs can accomodate "+nos+" students");
		}else if((c1>=nos && c2>=nos && c3<nos)||
				(c1>=nos && c3>=nos && c2<nos)||
				(c3>=nos && c2>=nos && c1<nos)) {
			System.out.println("2 labs can accomodate "+nos+" students");
		}else if((c1>=nos && c2<nos && c3<nos)||
				(c1>=nos && c3<nos && c2<nos)||
				(c3>=nos && c2<nos && c1<nos)) {
			System.out.println("1 labs can accomodate "+nos+" students");
		}else {
			System.out.println("None of the labs can accomodate "+nos+" students");
		}
	}

}
