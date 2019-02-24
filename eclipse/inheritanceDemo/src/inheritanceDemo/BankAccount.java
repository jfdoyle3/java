/**
 * 
 */
package inheritanceDemo;

/**
 * @author Jim Doyle 
 *
 */

// Declare class:

public class BankAccount {
	
// Declare local variables: private keeps variables to class only
	private String owner;
	private double balance;
	
/*
 *  Declaring a Constructor: 
 * this method will be called when using:
 *  	BankAccount varName=new BankAccount();
 *  default owner and balance.
 */
	public BankAccount() {
		owner="Jim Doyle";
		balance=0.00;		
	}
	
/*
 *  	New Account:
 *  	BankAccount(owner,balance);
 */

	public BankAccount(String owner, double balance)
	{
		this.owner=owner;
		this.balance=balance;
	}
	
/*
 * 	Deposit into Account:
 * 	BankAccount.Deposit(amount);
 */
	public void Deposit(double amount)
	{
		balance +=amount;
	}
/*
 * 	Deposit into Account:
 * 	BankAccount.Withdraw(amount);
 */
	public void Withdraw(double amount)
	{
		balance-=amount;
	}
/*
 * 	Deposit into Account:
 * 	BankAccount.GetOwner();  - returns Owner Name
 */	
	public String GetOwner()
	{
		return this.owner;
	}
/*
 * 	Deposit into Account:
 * 	BankAccount.GetBalance();  - returns Owner Balance
 */		
	public double GetBalance()
	{
		return this.balance;
	}
}
