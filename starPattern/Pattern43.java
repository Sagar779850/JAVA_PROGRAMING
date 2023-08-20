package starPattern;

public class Pattern43 {

	public static void main(String[] args)
	{
	System.out.println("Program Started");
	int line=5;
	int starcount=5;
	int spacecount=0;
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
			starcount=starcount-2;
			spacecount++;
		}
		else
		{
			starcount=starcount+2;
			spacecount--;
		}
	}
	System.out.println("Program Ended");
	}
}
