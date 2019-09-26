package variablesanddatatypes1;

import java.util.Scanner;

public class arithmaticoperartors1
 {
	
	
	public static void main(String[] args)
	{
		
		
		int first, second, add, subtract, multiply;
	    float devide;
	    Scanner scanner = new Scanner(System.in);
	 
	    
	    //{The Scanner class is a class in java.util,
	    //which allows the user to read values of various types.
	    //system.in An Input Stream which is typically connected
	    //to keyboard input of console programs. Scanner S=new Scanner.}

	    System.out.print("Enter Two Numbers : ");
	    first = scanner.nextInt();
	    second = scanner.nextInt();

	    add = first + second;
	    subtract = first - second;
	    multiply = first * second;
	    devide = (float) first / second;
 
	    System.out.println("Sum = " + add);
	    System.out.println("Difference = " + subtract);
	    System.out.println("Multiplication = " + multiply);
	    System.out.println("Division = " + devide);
			
	}
 }