package string;

public class stringclass1 
{

	public static void main(String[] args) 
	{
		String str="Anand";
		
		String str2="anand";
		
		//1
		System.out.println(str.length());

		//2
		System.out.println(str.charAt(4));
		
		//3
		System.out.println(str.toUpperCase());
		
		//4
		System.out.println(str.toLowerCase());
		
		//5
		System.out.println(str.trim());
		
		//6
		System.out.println(str.equals(str2));
		
		//7
		System.out.println(str.trim().equalsIgnoreCase(str2));
		
		//8
		System.out.println(str.replace("n", "d"));
		
		
		//9
		String[] temp=str.split("n");
		for(String s:temp)
		{
			System.out.println(s);
		}
		
		//10
					System.out.println(str.substring(2));
			
		//11
					System.out.println(str.substring(2, 4));
					
	}
}
