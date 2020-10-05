import java.util.Scanner;

public class NumberPattern {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int i, j;
		for (i = 1; i <= num; i++) {
			if (i % 3 != 0) {
				for (j = 1; j <= i; j++) {
					System.out.print(i);
				}
				System.out.print("\n");
			}
		}
	}

}
