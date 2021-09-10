
public class LoanCommand {
	Account account;
	
	public void addAccount(Account account, long principal, int no_of_years, double rate)
	{
		this.account = account;
		double interest = principal * no_of_years * rate; //800
		long ammount = principal + (long)Math.ceil(interest / 100); // 2080
		this.account.setTotal_ammount(ammount);
		this.account.setEmi_ammount((long)Math.ceil(Math.ceil(ammount/ no_of_years) / 12)); //96
		this.account.setTotal_emi_count(12 * no_of_years);
	}
	
}
