package rough;

import java.util.Scanner;

public class Factorialwithrecursion {

	static int fact=1;
	public static void main(String[] args)
	{
	System.out.println("Program Started");
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a Number : ");
	int no=scan.nextInt();
	Factorialwithrecursion f1=new Factorialwithrecursion();
	f1.factrec(no);
	System.out.println("Factorial of "+no+" is : "+fact);
	}
	public void factrec(int no)
	{
		if(no>1)
		{
			fact=fact*no;
			factrec(no-1);
		}
	}
}
