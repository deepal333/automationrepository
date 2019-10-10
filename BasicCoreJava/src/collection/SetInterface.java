package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface 
{

	public static void main(String[] args) 
	{
		//Hashset
		Set<Integer>set;
		
		set= new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(20);
		for(int s:set)
		{
			System.out.println(s);
		}	
		System.out.println("**********************************");
	
	//LinkedHashSet
	
	set= new LinkedHashSet<>();
	set.add(10);
	set.add(20);
	set.add(30);
	set.add(20);
	for(int s:set)
	{
		System.out.println(s);
	}	
	System.out.println("**********************************");

	//TreeSet
	set= new TreeSet<>();
	set.add(10);
	set.add(20);
	set.add(30);
	set.add(20);
	for(int s:set)
	{
		System.out.println(s);
	}	
	System.out.println("**********************************");

}
}