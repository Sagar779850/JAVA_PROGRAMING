package starPattern;

public class Pattern13 {

	public static void main(String[] args)
	{
	System.out.println("program Started");
	int line=5;
	int starcount=1;
	int spacecount=2;
	int mid=(line+1)/2;
	for(int i=1;i<=line;i++)
	{
		for(int j=1;j<=spacecount;j++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=starcount;k++)
		{
			System.out.print("*");
		}
		System.out.println();
		if(i<mid)
		{
			starcount++;
			spacecount--;
		}
		else
		{
			starcount--;
			spacecount++;
		}
	}
	System.out.println("Program Ended");
	}
}
