package conditionalstatements;

public class conditionaloperatorOr
{

	public static void main(String[] args) 
	{
		int pcm=60;
		int jre=30;
		int cet=60;
		
		if(pcm>=60)
		{
			if(jre>=30 || cet>=60)
			{
				System.out.println("You are Eligible");
			}
			
			
			else
			{
				System.out.println("You are not Eligible");
			}
		}
		
		else 
		{
			System.out.println("You are not eligible");
		}

	}

}
