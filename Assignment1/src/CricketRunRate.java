import java.util.Scanner;

public class CricketRunRate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);	
		System.out.println("Enter the number of overs bowled so far");
		int over = scan.nextInt();
		System.out.println("Enter the current run rate");
		float runRate = scan.nextFloat();
		System.out.println("Enter the largest score");
		int score = scan.nextInt();
		float requiredRunRate = (score-(runRate*over))/40;
		System.out.println("The required run rate is :"+ requiredRunRate);
	}

}
