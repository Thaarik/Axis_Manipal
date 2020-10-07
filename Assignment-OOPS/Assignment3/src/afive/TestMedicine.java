package afive;

public class TestMedicine {

	public static void main(String[] args) {
		Medicine [] medicine1 = new Medicine[5];
		int random;
		int minimum = 1;
		for(int i=0;i<5;i++) {
			random=(int)(Math.random()*3)+minimum;
			switch(random) {
			case 1:
				medicine1[i]=new Tablet();
				break;
			case 2:
				medicine1[i]=new Syrup();
				break;
			case 3:
			medicine1[i]=new Ointment();
			break;
			default:
				System.out.println("Nope");
			}
		}
		for(Medicine medicine:medicine1) {
			medicine.displayLabel();
		}
	}

}
