package inheritanceDemo;

public class checkingFees extends CheckingAccount {

	private final double FEES=20.00;
	
	public checkingFees()
	{
		super();
	}
	
	public  checkingFees(String owner, double initialBalance, int checkCount)
	{
		super(owner, initialBalance, checkCount);
	}
	
	public void deductFees()
	{
		this.Withdraw(FEES);
	}
}
