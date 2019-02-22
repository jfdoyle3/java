/**
 * 
 */
package inheritanceDemo;

/**
 * @author Jim Doyle 
 *
 */
public class BankAccount {
	
	private String owner;
	private double balance;
	
	public BankAccount() {
		owner="Jim Doyle";
		balance=0.00;
		
		
	}
	public BankAccount(String owner, double balance)
	{
		this.owner=owner;
		this.balance=balance;
	}
	public void Deposit(double amount)
	{
		balance +=amount;
	}
	public void Withdraw(double amount)
	{
		balance-=amount;
	}
	public String GetOwner()
	{
		return this.owner;
	}
	public double GetBalancd()
	{
		return this.balance;
	}
}
