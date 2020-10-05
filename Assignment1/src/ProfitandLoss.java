import java.util.Scanner;

public class ProfitandLoss {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of dozens of eggs purchased");
		float x=scan.nextFloat();
		System.out.println("Enter the price per dozen");
		float y = scan.nextFloat();
		System.out.println("Enter the selling price of 1 egg");
		float z = scan.nextFloat();
		float cp = y/12;
		float gain = z-cp;
		float profit= ((gain/cp)*100);
		System.out.println("Harish's profit percentage is "+Math.round(profit*100.0)/100.0+" percent");
	}

}
