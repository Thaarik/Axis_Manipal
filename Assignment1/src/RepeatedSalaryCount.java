import java.util.Scanner;

public class RepeatedSalaryCount {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int[] salary = new int[num];
		int total = 0;
		for (int i = 0; i < num; i++) {
			salary[i] = scan.nextInt();
		}

		for (int i = 0; i < salary.length; i++) {

			for (int j = i + 1; j < salary.length; j++) {
				if (salary[i] == salary[j]) {
					total++;
				}
			}

		}
		System.out.println(total);

	}

}
