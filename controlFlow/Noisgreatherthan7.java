package controlFlow;

import java.util.Scanner;

public class Noisgreatherthan7 {

	public static void main(String[] args)
	{
	System.out.println("Program Started");
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a Number : ");
	int no=scan.nextInt();
	if(no>7)
	{
		System.out.println("Number is Greather than 7");
	}
	System.out.println("Program Ended");
	}
}
