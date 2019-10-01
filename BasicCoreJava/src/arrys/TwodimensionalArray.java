package arrys;

public class TwodimensionalArray 
{

	public static void main(String[] args) 
	{
		String[][] str= new String[4][2];
		
		//Row 1
		str[0][0]="Username";
		str[0][1]="Password";
		
		//Row 2
		str[1][0]="U1";
		str[1][1]="P1";
		
		//Row 3
		str[2][0]="U2";
		str[2][1]="P2";
		
		//Row 4
		str[3][0]="U3";
		str[3][1]="P3";
		
		//System.out.println(str[2][1]);
		
		for(int r=0; r<4; r++)	//for(int r=0; r<str.length; r++)
		{
			for(int c=0; c<2; c++)		//for(int c=0; c<str[r].length; c++)
			{
				System.out.println(str[r][c]);
			}
		}
		
	
	}

}
