package afive;

class Syrup extends Medicine {
	
public Syrup() {
		super(200, "30/4/2040");
		// TODO Auto-generated constructor stub
	}

@Override
public void displayLabel() {
	super.getDetails();
	// TODO Auto-generated method stub
	System.out.println("Store in cold dry place");
}
}
