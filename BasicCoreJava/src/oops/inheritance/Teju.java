package oops.inheritance;

public class Teju
{

	public static void main(String[] args) 
	{
		
		Smartphone phone=new Smartphone();
		phone.calling();
		phone.texting();
		phone.internet();
		
			
		Teliphone phone2=new Teliphone();
		phone2.calling();
		
		phone2=new Smartphone();
		phone2.calling();
	}

}
