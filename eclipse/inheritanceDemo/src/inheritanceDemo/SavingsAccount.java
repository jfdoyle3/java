/**
 * 
 */
package inheritanceDemo;

/**
 * @author Jim Doyle
 *
 */
public class SavingsAccount extends BankAccount {
	
	private final double INTEREST_RATE=0.05; // using final is similar to const
	
	public SavingsAccount()
	{
		super(); 
	/*
	 * similar to coding:  BankAccount varName=new BankAccount();
	 * super() calls the extended constructor.
	 */
		 		  
	}
	public SavingsAccount(String owner, double initialBalance)
	{
		super(owner, initialBalance); 
		/*
		 * similar to coding:  BankAccount varName=new BankAccount();
		 * super(owner, initialBalance); 
		 * calls the extended constructor's variable names.
		 * must be the first line in the constructor
		 */
	}
	
	public void AddInterest()
	{
		double addInterest=(this.GetBalance()* INTEREST_RATE);
		this.Deposit(addInterest);
	}
	
	public double getiRate()
	{
		return INTEREST_RATE;
	}
	
	
	
	
	
	
	
	
	
}
