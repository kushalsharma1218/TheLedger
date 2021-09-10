import java.util.Map;

public class BalanceCommand {
	
	Account account;
	public String checkBalance(Account account, long emi_no)
	{

		this.account = account;
		long emi_ammount = this.account.getEmi_ammount();
		Map<Long, Long> lumpSumPayments = this.account.getLumpSum_ammount_paid_on_emi_no();
		
		
		long total_ammount_paid = 0;
		for(long i = 1;i<= emi_no;i++)
		{
			if(lumpSumPayments.containsKey(i))
			{
				total_ammount_paid += lumpSumPayments.get(i) + emi_ammount;
			}
			else{
				total_ammount_paid += emi_ammount;
			}
		}
		long total_emi_to_pay = this.account.getTotal_emi_count() - emi_no;
				
		return this.account.getBank_name() + " "+ this.account.getCustomer_name()+ " " + total_ammount_paid + " "+ total_emi_to_pay;
	}

}
