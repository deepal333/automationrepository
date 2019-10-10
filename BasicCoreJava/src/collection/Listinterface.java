package collection;


import java.util.ArrayList;
import java.util.List;
public class Listinterface 
{

	public static void main(String[] args) 
	{
		
		List list = new ArrayList();
		
		list.add("Anand");
		list.add(31);
		list.add(true);
		
		/*Object[] obj=new Object[3];
		obj[0]="Anand";
		obj[1]=31;
		obj[2]=true;*/
		
		for(Object o:list)
		{
			System.out.println(o);
		}
		
	}

}
