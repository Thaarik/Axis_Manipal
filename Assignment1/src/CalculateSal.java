import java.util.Scanner;

public class CalculateSal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int salary =scan.nextInt();
		if(salary>8000) {
			System.out.println("Salary is too large");
		}else if(salary<0) {
			System.out.println("Salary is too small");
		}else {
			int shifts= scan.nextInt();
			if(shifts==0) {
				System.out.println("Shifts too small");
			}else {
				int salarySavings=salary/2;
				int shiftsavings=shifts*2;
				int total = salarySavings+(salary/shiftsavings);
				System.out.println(total);
			}
		}
	}


}
