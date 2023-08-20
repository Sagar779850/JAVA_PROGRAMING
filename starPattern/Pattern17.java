package starPattern;

public class Pattern17 {

	public static void main(String[] args)
	{
	System.out.println("Program Started");
	int line=5;
	int starcount=1;
	int mid=(line+1)/2;
	for(int i=1;i<=line;i++)
	{
		for(int j=1;j<=starcount;j++)
		{
			if(j==1 || j==starcount )
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
		}
		else
		{
			starcount--;
		}
	}
	System.out.println("Program Ended");
	}
}
