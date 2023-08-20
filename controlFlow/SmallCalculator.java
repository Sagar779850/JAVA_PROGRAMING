package controlFlow;

import java.util.Scanner;

public class SmallCalculator {

	public static void main(String[] args)
	{
	System.out.println("Program Started");
	Scanner scan=new Scanner(System.in);
	System.out.println("Plz enter product Amount ");
	int amt=scan.nextInt();
	
	if(amt>50000)
	{
		System.out.println("your product amount : "+amt+" is selected for 25% discount ");
		double totalAmt=amt*0.25;
		System.out.println("Discount the amt : "+totalAmt);
		double finalAmt=amt-totalAmt;
		System.out.println("After discount Amt : "+finalAmt);
	}
	else if(amt>=25000 && amt<=50000)
	{
		System.out.println("your product amount : "+amt+" is selected for 20% discount ");
		double totalAmt=amt*0.20;
		System.out.println("Discount the amt : "+totalAmt);
		double finalAmt=amt-totalAmt;
		System.out.println("After discount Amt : "+finalAmt);		
	}
	else if(amt>=15000 && amt<=25000)
	{
		System.out.println("your product amount : "+amt+" is selected for 15% discount ");
		double totalAmt=amt*0.15;
		System.out.println("Discount the amt : "+totalAmt);
		double finalAmt=amt-totalAmt;
		System.out.println("After discount Amt : "+finalAmt);		
	}
	else if(amt>=10000 && amt<=15000)
	{
		System.out.println("your product amount : "+amt+" is selected for 10% discount ");
		double totalAmt=amt*0.10;
		System.out.println("Discount the amt : "+totalAmt);
		double finalAmt=amt-totalAmt;
		System.out.println("After discount Amt : "+finalAmt);		
	}
	else
	{
		System.out.println("your product amount : "+amt+" no discount is available ");
	}
	System.out.println("Program Ended");
	}
}
