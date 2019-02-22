/**
 * 
 */
package inheritanceDemo;

/**
 * @author Jim Doyle
 *
 */
public class CheckingAccount extends BankAccount {
	
	private int checkCount;
	
	public CheckingAccount()
	{
		super();
		checkCount=100;
	}
	public CheckingAccount(String owner, double initialBalance, int checkCount)
	{
		super(owner,initialBalance); //  super()  must be the first line in the constructor. errors out if not.
		this.checkCount=checkCount;
	}
	public void useCheck() 
	{
		checkCount--;
	}
	public void getCheck()
	{
		checkCount++;
	}

}