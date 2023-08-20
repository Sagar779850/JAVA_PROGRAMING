package starPattern;

public class Pattern5 {

	public static void main(String[] args)
	{
	System.out.println("Program Started");
	int line=5;
	int starcount=9;
	for(int i=1;i<=line;i++)
	{
		for(int j=1;j<=starcount;j++)
		{
			System.out.print("*");
		}
		System.out.println();
		starcount=starcount-2;
	}
	System.out.println("Program Ended");
	}
}
