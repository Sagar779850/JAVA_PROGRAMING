package starPattern;

public class Pattern21 {

	public static void main(String[] args)
	{
	System.out.println("Program Started");
	int line=5;
	int starcount=1;
	int spacecount=4;
	int mid=(line+1)/2;
	for(int i=1;i<=line;i++)
	{
		for(int j=1;j<=starcount;j++)
		{
			if(j==1 || j==starcount)
			{
			System.out.print("*");
			}
			else
			{
			System.out.print(" ");	
			}
		}
		for(int k=1;k<=spacecount;k++)
		{
		System.out.print(" ");	
		}
		for(int l=1;l<=starcount;l++)
		{
			if(l==1 || l==starcount)
			{
			System.out.print("*");	
			}
			else
			{
			System.out.print(" ");	
			}
		}
		System.out.println();
		if(i<mid)
		{
			starcount++;
			spacecount=spacecount-2;
		}
		else
		{
			starcount--;
			spacecount=spacecount+2;
		}
	}
	System.out.println("Program Ended");
	}
	
}
