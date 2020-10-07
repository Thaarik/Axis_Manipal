package afive;

class Ointment extends Medicine{

	public Ointment() {
		super(252, "24/4/2022");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void displayLabel() {
		super.getDetails();
		// TODO Auto-generated method stub
		System.out.println("For external use only");
	}
	
}
