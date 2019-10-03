package oops.abstraction;

public class SBI implements RBI
{
	//override
	public void savingAccount()
	{
		System.out.println("savingAccount in SBI");
	}
	


	@Override
	public void currentAccount() 
	{
		System.out.println("currentAccount in SBI");
		
	}

	@Override
	public void debitCard()
	{
		System.out.println("debitCard in SBI");
		
	}

	@Override
	public void creditCard() 
	{
		System.out.println("creditCard in SBI");
		
	}
}