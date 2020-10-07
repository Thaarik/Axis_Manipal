package aone;

public class Customer {
	private String customerName;
	private Address residentialAddress;
	
	public Customer(){
		
	}

	public Customer(String customerName, Address residentialAddress) {
		
		this.customerName = customerName;
		this.residentialAddress = residentialAddress;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getResidentialAddress() {
		return residentialAddress.getAddressDetails();
	}

	public void setResidentialAddress(Address residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	
	public String getCustomerDetails() {
		return "Customer: "+this.customerName+"\nResidential Address :"+this.residentialAddress.getAddressDetails();
	}

	
	
}
