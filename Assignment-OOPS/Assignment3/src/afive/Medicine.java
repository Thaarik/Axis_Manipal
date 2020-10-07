package afive;

public abstract class Medicine {
	public float price;
	public String expiryDate;


	public Medicine(float price, String expiryDate) {
		
		this.price = price;
		this.expiryDate = expiryDate;
	}

	public void getDetails() {
		System.out.println(price+":"+expiryDate);
	}
	
	public abstract void displayLabel();
}







