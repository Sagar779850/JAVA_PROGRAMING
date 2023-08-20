package Loopingstatement;

public class BreakandContinue {

	public static void main(String[] args)
	{
	System.out.println("Program Started");
	System.out.println("Break statement Example : ");
	for(int i=1;i<=5;i++)
	{
		if(i==3)
		{
			break;
		}
		System.out.println(i);
	}
	System.out.println("Continue statement Example :");
	for(int i=1;i<=5;i++)
	{
		if(i==3)
		{
			continue;
		}
		System.out.println(i);
	}
	System.out.println("Program Ended");
	}
}
