package afour;

public class Customer {
	private String customerName;
	private Address residentialAddress;
	private Address officialAddress;
	
	public Customer(){
		
	}

	public Address getOfficialAddress() {
		return officialAddress;
	}

	public void setOfficialAddress(Address officialAddress) {
		this.officialAddress = officialAddress;
	}

	

	public Customer(String customerName, Address residentialAddress, Address officialAddress) {
		super();
		this.customerName = customerName;
		this.residentialAddress = residentialAddress;
		this.officialAddress = officialAddress;
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
		return "Customer: "+this.customerName+"\nResidential Address :"+this.residentialAddress.getAddressDetails()+
				"\nOfficical Address: "+this.officialAddress.getAddressDetails();
	}

	
	
}
