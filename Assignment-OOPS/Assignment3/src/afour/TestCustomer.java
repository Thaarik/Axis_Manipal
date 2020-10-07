package afour;

public class TestCustomer {

	public static void main(String[] args) {
		Address residentialAddress = new Address("123,Main layout","Bangalore");
		Address officialAddress = new Address("321,Main city","Bangalore");
		
		Customer customer = new Customer("Abby",residentialAddress,officialAddress);
		System.out.println(customer.getCustomerDetails());
	}

}
