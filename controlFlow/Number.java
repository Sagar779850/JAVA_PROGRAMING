package controlFlow;

import java.util.Scanner;

public class Number {

	public static void main(String[] args)
	{
	System.out.println("Program Started");
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a Number :");
	int no=scan.nextInt();
	if(no>0)
	{
		System.out.println(no+"Positive Number!!!");
	}
	else
	{
		System.out.println(no+"Negative Number!!!");
	}
	System.out.println("Program Ended");
	}
}
