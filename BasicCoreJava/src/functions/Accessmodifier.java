package functions;

public class Accessmodifier
{
	public static void main(String[] args)
	{
		Accessmodifier obj= new Accessmodifier();
		obj.publicfunction();
		obj.privatefunction();
		obj.noAccessModfunction();
		obj.protectedfunction();
	}
	public void publicfunction()
	{
		System.out.println("Public Function");
	}
	
	private void privatefunction()
	{
		System.out.println("Private Function");
	}
	
	void noAccessModfunction()
	{
		System.out.println("No Access Mod. Function");
	}
	
	protected void protectedfunction()
	{
		System.out.println("Protected Function");
	}
	
	
}
