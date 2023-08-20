package starPattern;

public class Pattern4 {

	public static void main(String[] args)
	{
	System.out.println("Program Started");
	int line=5;
	int starcount=1;
	for(int i=1;i<=line;i++)
	{
		for(int j=1;j<=starcount;j++)
		{
			System.out.print("*");
		}
		System.out.println();
		starcount=starcount+2;
	}
	System.out.println("Program Ended");
	}
}
