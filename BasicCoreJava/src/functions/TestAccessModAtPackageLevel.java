package functions;

public class TestAccessModAtPackageLevel 
{

	public static void main(String[] args) 
	{
		Accessmodifier obj= new Accessmodifier();
		obj.publicfunction();
		obj.protectedfunction();
		obj.noAccessModfunction();
		obj.protectedfunction();
	}

}
