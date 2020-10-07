package afive;

public class Tablet extends Medicine{
	public Tablet() {
		super(100,"30/3/2025");
	}

	@Override
	public void displayLabel() {
		super.getDetails();
		// TODO Auto-generated method stub
	System.out.println( "Store in cold dry place");
	}
	
}
