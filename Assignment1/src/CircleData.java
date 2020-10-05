import java.util.Scanner;

public class CircleData {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the radius:");
		float radius = scan.nextFloat();
		System.out.println("Enter Output required:");
		String code = scan.next();
		float result;
		switch(code) {
		case "DIA":
			result = 2*radius;
			System.out.println("Diameter of circle is "+result);
			break;
		case "AR":
			result= (float)(3.14*(radius*radius));
			System.out.println("Area of circle is "+ result);
			break;
		case "PER":
			result = (float)(2*3.14*radius);
			System.out.println("Perimeter of circle is "+result);
			break;
		case "ARSEM":
			result=(float)(3.14*radius);
			System.out.println("Area of semi circle is "+ result);
			break;
		default:
			System.out.println("Please enter correct code!");
		}
	}

}
