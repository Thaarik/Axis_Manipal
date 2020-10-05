import java.util.Scanner;

public class ElectricBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the previous reading:");
		int preading = scan.nextInt();
		System.out.println("Enter the current reading: ");
		int creading = scan.nextInt();
		int unit = creading - preading;
		float amount;
		if (unit > 100) {
			amount = (float)((30*2.3)+(70*3.5)+((unit-100)*4.6));
		}else if (unit>=70 && unit<30) {
			amount=(float)((30*2.3)+((unit-30)*3.5));
		}else {
			amount = (float)((unit-30)*2.3);
		}
		System.out.println("The Bill amount is: "+ amount);
	}

}
