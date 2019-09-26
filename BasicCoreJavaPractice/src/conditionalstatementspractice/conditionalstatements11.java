package conditionalstatementspractice;

public class conditionalstatements11
{

	public static void main(String[] args)
	{
		int a=50;
		int b=40;
		
		System.out.println(a>b);
		if(a>b)
			{
				System.out.println("a is greater than b");	
			} else if (a == b)
		    	{
					System.out.println("a is equal to b");
		    	} 
		else
			{
				System.out.println("a is less than b");
			}
		
		System.out.println(a<b);
		if(a<b)
			{
				System.out.println("a is less than b");
			} else if (a == b)
					{
						System.out.println("a is equal to b");
					} 
		else
			{
				System.out.println("a is greater than b");
			}
		
		System.out.println(b>a);
		if(b>a)
			{
				System.out.println("b is greater than a");
			}else if (a == b)
				{
					System.out.println("a is equal to b");
				} 
		else
			{
			System.out.println("b is less than a");
			}
		
		System.out.println(b<a);
		if(b<a)
			{
				System.out.println("b is less than a");
			}else if (a == b)
	    		{
					System.out.println("a is equal to b");
	    		} 
		else
			{
			System.out.println("b is greater than a");
			}
		
		
		System.out.println(a!=b);
		if (a!=b)
			{
				System.out.println("a is not equal to b");
			}	
		
		else
			{
				System.out.println("a is equal to b");
			}
		
	}
	}
