package functions;

public class user1 
{

	public static void main(String[] args) 
	{
		Car polo= new Car();
		
		
		polo.wheels=4;
		polo.colour="silver";
		polo.type="sedan";
		polo.accelaration();
		
		Car Car2=new Car();
		Car2.wheels=4;
		Car2.colour="red";
		Car2.type="Hatchbak";
		Car2.accelaration();
		
		Car Car3=new Car();
		
		
		System.out.println(polo.colour);
		System.out.println(Car2.colour);
		System.out.println(Car3.colour);
		
		System.out.println(polo.wheels);
		System.out.println(Car2.wheels);
		System.out.println(Car3.wheels);

	}

}
