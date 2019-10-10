package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Listinterface2 
{

	public static void main(String[] args) 
	{
		List<String> list;
		//ArrayList
		/*list= new ArrayList<>();
		list.add("Animesh");
		list.add("Pradeep");
		list.add("Mahesh");
		list.add("pradeep");
		
		for(String s:list)
		{
			System.out.println(s);
		}*/
		
		//LinkedList
		/*list= new LinkedList<>();
		list.add("Animesh");
		list.add("Pradeep");
		list.add("Mahesh");
		list.add("pradeep");
		
		for(String s:list)
		{
			System.out.println(s);
		}*/
		
		//Vector
		list= new LinkedList<>();
		list.add("Animesh");
		list.add("Pradeep");
		list.add("Mahesh");
		list.add("pradeep");
		
		for(String s:list)
		{
			System.out.println(s);
		}
	}

}
