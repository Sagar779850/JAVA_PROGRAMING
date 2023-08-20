package rough;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args)
	{
	System.out.println("Program Started");	
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a Number : ");
	int no=scan.nextInt();
	int count=0;
	for(int i=1;i<=no;i++)
	{
		if(no%i==0)
		{
			count++;
		}
	}
	if(count==2)
	{
		System.out.println(no+" : Prime Number!!");
	}
	else
	{
		System.out.println(no+" : Not Prime Number!!");
	}
	System.out.println("program Ended");
	}
}
