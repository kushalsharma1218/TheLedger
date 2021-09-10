
public class Customer {
	private String customer_name;
	private String bank_name;
	
	public Customer(String bank_name, String borrower_name) {
		this.bank_name = bank_name;
		this.customer_name = borrower_name;
	}

	
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}



	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getBank_name() {
		return bank_name;
	}
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}	
}
