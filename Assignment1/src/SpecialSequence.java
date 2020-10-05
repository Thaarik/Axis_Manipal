import java.util.Scanner;

public class SpecialSequence {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a = 2;
		int b = 1;
		int c = 3;
		int next = 0;
		System.out.println(a + "\n" + b + "\n" + c);
		while (c <= n) {
			next = a + b + c;
			if (next <= n) {
				a = b;
				b = c;
				c = next;
				System.out.println(c);
			}

		}

	}
}