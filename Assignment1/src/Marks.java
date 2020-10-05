import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of students:");
		int num = scan.nextInt();
		int [] marks = new int[num];
		System.out.println("Enter marks scored");
		for(int i=0;i<num;i++) {
			marks[i]=scan.nextInt();
		}
		
		int minvalue = marks[0];
		for(int i=1;i<marks.length;i++) {
			if(marks[i]<minvalue) {
				minvalue = marks[i];
			}
		}
		System.out.println("Minimum marks:"+minvalue);
		
		int maxvalue = marks[0];
		for(int i=1;i<marks.length;i++) {
			if(marks[i]>maxvalue) {
				maxvalue = marks[i];
			}
		}
		System.out.println("Maximum marks:"+maxvalue);
		
		int total=0;
		for(int i=0;i<num;i++) {
			total = total+marks[i];
		}
		double average = total/marks.length;
		System.out.format("The average is : %.2f", average);
	}

}
