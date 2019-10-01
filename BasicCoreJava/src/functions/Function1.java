package functions;

public class Function1
{

	public static void main(String[] args) 
	{
		Sum(10,20);
		Sum(108,209);
		Sum(50,208);
		Sum(1070,920);
		
		
		/*int a=10;
		int b=20;
		
		int sum=a+b;
		System.out.println(sum);
		
		int d=40;
		System.out.println(sum+d);
		
		int e=481;
		int f=371;
		System.out.println(e+f);*/
		
		int add=Sum1(10,20);
		System.out.println(add);
		
		int add1=Sum1(10, 20, 30);
		System.out.println(add1);		
		
	}

	//Type 1
	public static void Sum(int a, int b)
		{
			int add=a+b;
			System.out.println(add);
		}
	
	//Type2
	public static int Sum1(int a, int b)
	{
		return a+b;
	}
	
	//Type 3
	public static int Sum1(int a, int b, int c)
	{
		return a+b+c;
	}

	

}
