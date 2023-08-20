package starPattern;

public class Pattern28 {

	public static void main(String[] args)
	{
	System.out.println("Program Started");
	int line=5;
	int starcount=5;
	for(int i=1;i<=line;i++)
	{
		for(int j=1;j<=starcount;j++)
		{
			if(j==1 || j==starcount || i==1)
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
