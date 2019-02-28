/**
 * 
 */
package inheritanceDemo;

/**
 * @author Jim Doyle
 *
 */
public class BankAccountTest {

	public static void main(String[] args) {
		
		
// 	Create Object:
		BankAccount ba=new BankAccount("Ed", 1000.00);
		Print("Bank Account:");
		
//  Print Object variables:
		Print("Account Name:" +ba.GetOwner());
		Print("Deposited into Account: "+ba.GetBalance()+"\n");
		
//  SubClass inherits Bank Account
		
		Print("-------Savings Account------");
		SavingsAccount sa=new SavingsAccount ("Jim",500.00);
		double deposit=20.00;
		
//	Savings Account using Bank Account Deposit function.
		
		sa.Deposit(deposit);
		
// Savings Account using it's own function.
		sa.AddInterest();
		
// Return Bank Accounts Owner and Balance.
		Print("Account Name: "+ sa.GetOwner());
		Print ("ATM Deposit:"+deposit+" w/interest @"+sa.getiRate());
		Print("Deposit: "+sa.GetBalance());

// Create new Checking Account
		Print("-------Checking Account------");
		CheckingAccount ca=new CheckingAccount ("Sam",300.00,10);
		Print (ca.GetOwner()+" Opens a new Checking Account with "+ca.getChecks()+" checks.");
// Using Banking Account Withdraw function.
		double wroteCheck=200.00;
		ca.Withdraw(wroteCheck);
		
// Using Checking own function.
		ca.UseCheck();
		
// Return CA:# of Checks, BA:Owner , Current Balance - pass thru from Bank Account.
		Print("Wrote a check for "+wroteCheck+" Checks left: "+ca.getChecks());
		Print(ca.GetBalance());
		Print("-------Checking w/Fees Account------");

		double withdraw=125.00;

		CheckingAccountFees caf= new CheckingAccountFees("Sean",3000.00,10);
		caf.Withdraw(withdraw);
		caf.deductFees();
		caf.UseCheck();
		Print(caf.GetBalance());
		
// 		
		Print("-------Bank Account Owners: BA,SA,CA,CAF------");		
		owner(ba);
		owner(sa);
		owner(ca);
		owner(caf);
		
	}
	public static void  Print(Object input)
	{
		System.out.println(input);
	}
	
// Super() Allows/inherits Bank Account to know the owners in Savings/Checking and Fees
	public static void owner(BankAccount f)
	{
		Print(f.GetOwner());
	}
}
