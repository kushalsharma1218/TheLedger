import java.util.Map;

public class PaymentCommand {
	Account account;
	
	public void updateAmmount(Account account, long ammount, long emi_no)
	{
		this.account = account;
		long total_ammount_to_pay =this.account.getTotal_ammount();
		long total_number_of_emi_to_be_paid = this.account.getTotal_emi_count();
		long ammount_paid = this.account.getAmmount_paid();
		long emi_ammount = this.account.getEmi_ammount();
		
		
		Map<Long, Long> getLumpSumPayments = this.account.getLumpSum_ammount_paid_on_emi_no();
		getLumpSumPayments.put(emi_no, ammount);
		
		ammount_paid += ammount;
		if(ammount_paid  >= total_ammount_to_pay)
		{
			this.account.setAmmount_paid(total_ammount_to_pay);
			this.account.setEmi_paid(total_number_of_emi_to_be_paid);
		}
		else{
			this.account.setAmmount_paid(ammount_paid);
			long no_of_emi_paid_in_current_ammount = (long) Math.ceil(ammount_paid / emi_ammount);
			this.account.setTotal_emi_count(total_number_of_emi_to_be_paid - no_of_emi_paid_in_current_ammount); 
			this.account.setEmi_paid(emi_no);
		}
	}
}
