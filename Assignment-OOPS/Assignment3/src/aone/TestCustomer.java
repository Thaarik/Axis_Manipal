package aone;

public class TestCustomer {

	public static void main(String[] args) {
		Customer customer = new Customer();
		Address add = new Address("23b,HSR","BAngalore");
		customer.setCustomerName("John");
		customer.setResidentialAddress(add);
		System.out.println(customer.getCustomerName());
		System.out.println(customer.getResidentialAddress());
		Customer customer1 = new Customer("Ram",add);
		System.out.println(customer1.getCustomerDetails());
		
	}

}
