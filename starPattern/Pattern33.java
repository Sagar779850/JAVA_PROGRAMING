package starPattern;

public class Pattern33 {

	public static void main(String[] args)
	{
	System.out.println("Program Started");
	int line=5;
	int starcount=5;
	int mid=(line+1)/2;
	for(int i=1;i<=line;i++)
	{
		for(int j=1;j<=starcount;j++)
		{
			if(i==1 || j==mid)
			{
			System.out.print("*");	
			}
			else
			{
			System.out.print(" ");	
			}
		}
		System.out.println();
	}
	System.out.println("Program Ended");
	}
}
