import java.util.Scanner;

public class DecimalConversion {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int binary = scan.nextInt();
		int d = 0;
		int p = 0;
		int c = binary;
		boolean b = true;
		while (c != 0) {
			int temp = c % 10;
			if (temp > 1) {
				b = false;
				break;
			} else {
				c = c / 10;
			}
		}
		if (b) {

			while (true) {
				if (binary == 0 || binary >= 11111) {
					
					break;
				} else {
					int temp = binary % 10;
					d += temp * Math.pow(2, p);
					binary = binary / 10;
					p++;
				}
			}
			System.out.println(d);
		} else {
			System.out.println("invalid input");
		}
	}

}
