package loops;

import functions.Accessmodifier;


public class TestAccessModAtProjectLevel extends Accessmodifier
{

	public static void main(String[] args) 
	{
		Accessmodifier obj= new Accessmodifier();
		obj.publicfunction();
		
		TestAccessModAtProjectLevel obj2=new TestAccessModAtProjectLevel();
		obj2.protectedfunction();
		

	}

}
