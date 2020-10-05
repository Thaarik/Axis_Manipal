import java.util.Scanner;

public class KaprekarNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int square = num*num;
		int digit = 0;
		boolean flag = false;
		while(square!=0) {
			digit++;
			square=square/10;
		}
		square=num*num;
		for(int i=digit-1;i>0;i--) {
			int firstPart=square/(int)Math.pow(10,  i);
			int secondPart=square%(int)Math.pow(10, i);
			
			if(firstPart ==0 || secondPart == 0) {
				continue;
			}
			
			int sum = firstPart+secondPart;
			
			if(sum == num) {
				flag=true;
				
			}
		}
		if(flag) {
			System.out.println("Kaprekar Number");
		}else {
			System.out.println("Not a Kaprekar Number");
		}
		
	}

}
