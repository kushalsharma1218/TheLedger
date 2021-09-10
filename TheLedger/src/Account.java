import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Account extends Customer {
	
	private long total_ammount;
	private long ammount_paid;
	private long emi_ammount;
	private long total_emi_count;
	private long emi_paid;
	private Map<Long, Long> lumpSum_ammount_paid_on_emi_no = new HashMap<>();
	
	public Account(){
		super();
	}

	public Map<Long, Long> getLumpSum_ammount_paid_on_emi_no() {
		return lumpSum_ammount_paid_on_emi_no;
	}

	public void setLumpSum_ammount_paid_on_emi_no(Map<Long, Long> lumpSum_ammount_paid_on_emi_no) {
		this.lumpSum_ammount_paid_on_emi_no = lumpSum_ammount_paid_on_emi_no;
	}

	public long getTotal_ammount() {
		return total_ammount;
	}
	public void setTotal_ammount(long total_ammount) {
		this.total_ammount = total_ammount;
	}
	public long getEmi_ammount() {
		return emi_ammount;
	}
	public void setEmi_ammount(long emi_ammount) {
		this.emi_ammount = emi_ammount;
	}
	public long getTotal_emi_count() {
		return total_emi_count;
	}
	public void setTotal_emi_count(long total_emi_count) {
		this.total_emi_count = total_emi_count;
	}

	public long getAmmount_paid() {
		return ammount_paid;
	}

	public void setAmmount_paid(long ammount_paid) {
		this.ammount_paid = ammount_paid;
	}

	public long getEmi_paid() {
		return emi_paid;
	}

	public void setEmi_paid(long emi_paid) {
		this.emi_paid = emi_paid;
	}
	
}
