package oops.abstraction;

public class PNB implements RBI
{

	@Override
	public void savingAccount() 
	{
		System.out.println("savingAccount in PNB");
		
	}

	@Override
	public void currentAccount() 
	{
		System.out.println("currentAccount in PNB");
		
	}

	@Override
	public void debitCard()
	{
			System.out.println("debitCard in PNB");
		
	}

	@Override
	public void creditCard() 
	{
		System.out.println("creditCard in PNB");
		
	}


}
