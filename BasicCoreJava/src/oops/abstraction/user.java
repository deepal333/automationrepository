package oops.abstraction;

public class user 
{
	public static void main()
	{
		RBI acc;
		
		acc=new SBI();
		
		acc.currentAccount();
		acc.savingAccount();
		acc.debitCard();
		acc.creditCard();
		
		acc=new PNB();
		
		acc.currentAccount();
		acc.savingAccount();
		acc.debitCard();
		acc.creditCard();
		
		acc=new CANARA();
		acc.currentAccount();
		acc.savingAccount();
		acc.debitCard();
		acc.creditCard();
		
	}
}
