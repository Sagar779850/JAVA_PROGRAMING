package rough;

import java.util.Scanner;

public class PalimdromeNumber {

	public static void main(String[] args)
	{
	System.out.println("Program Started");
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a Number : ");
	int no=scan.nextInt();
	int r=0;
	int sum=0;
	int temp=no;
	while(temp>=1)
	{
		r=temp%10;
		sum=(sum*10)+r;
		temp=temp/10;
	}
	System.out.println("Given a Number : "+no);
	System.out.println("Reverse a Number : "+sum);
	if(no==sum)
	{
	System.out.println(no+" : Palimdrome Number!!");	
	}
	else
	{
	System.out.println(no+" : Not Palimdrome Number");	
	}
	System.out.println("Program Ended");
	}
}
