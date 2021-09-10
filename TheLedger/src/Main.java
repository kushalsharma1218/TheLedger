import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated metho	d stub
		
		Map<String, Account> storage = new HashMap<>();

		
		
		try{
			File file = new File("/TheLedger/src/input.txt");
			try(Scanner sc = new Scanner(file))
			{
				while(sc.hasNextLine())
				{
					String command = sc.nextLine();
					processInput(storage,command);
				}
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Check input file");
		}
	}
	public static void processInput(Map<String, Account> storage, String command)
	{
		Account account;
		LoanCommand loanCommand = new LoanCommand();
		PaymentCommand paymentCommand = new PaymentCommand();
		BalanceCommand balanceCommand = new BalanceCommand();
		String[] commandParams = command.split(" ");
		switch(commandParams[0])
		{
			case "LOAN":
				account = new Account();
				account.setBank_name(commandParams[1]);
				account.setCustomer_name(commandParams[2]);
				// Bank_Name + Borrower_Name as a key, just for storage purpose
				loanCommand.addAccount(account, Long.parseLong(commandParams[3]), Integer.parseInt(commandParams[4]), Double.parseDouble(commandParams[5]));
				storage.put(commandParams[1] + commandParams[2], account);
				break;
			
			case "PAYMENT":
				String pay_key = commandParams[1] + commandParams[2];
				account  = storage.get(pay_key);
				paymentCommand.updateAmmount(account, Long.parseLong(commandParams[3]), Long.parseLong(commandParams[4]));
				storage.put(pay_key, account);
				break;
				
			case "BALANCE":
				String bal_key = commandParams[1] + commandParams[2];
				account  = storage.get(bal_key);
				String output = balanceCommand.checkBalance(account, Long.parseLong(commandParams[3]));
				System.out.println(output);
				break;
		}
	}

}
