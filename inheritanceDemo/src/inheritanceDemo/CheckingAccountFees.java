package inheritanceDemo;

public class CheckingAccountFees extends CheckingAccount {

	private final double FEES=20.00;
	
	public CheckingAccountFees()
	{
		super();
	}
	
	public  CheckingAccountFees(String owner, double initialBalance, int checkCount)
	{
		super(owner, initialBalance, checkCount);
	}
	
	public void deductFees()
	{
		this.Withdraw(FEES);
	}
}
