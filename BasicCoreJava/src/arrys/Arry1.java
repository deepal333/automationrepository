package arrys;

public class Arry1
{
	public static void main(String[] args)
	{
		String[] str=new String[10];
		
		str[0]="Animesh";
		str[1]="Tejashree";
		str[2]="Mahesh";
		str[3]="Pradeep";
		str[4]="Bhushan";
		str[5]="Nikhil";
		str[6]="Shubhangee";
		str[7]="Babasaheb";
		str[8]="Shubhada";
		str[9]="Amit";

		//System.out.println(str[3]);
		
		System.out.println(str.length);
		//for(int i=0; i<str.length; i++)
			//System.out.println(str[i]);
		for(String s:str)
			{
				System.out.println(s);
			}
	}

}
