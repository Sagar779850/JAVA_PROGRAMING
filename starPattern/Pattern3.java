package starPattern;

public class Pattern3 {

	public static void main(String[] args)
	{
	System.out.println("Program Started");
	int line=5;
	int starcount=5;
	for(int i=1;i<=line;i++)
	{
		for(int j=1;j<=starcount;j++)
		{
			System.out.print("*");
		}
		System.out.println();
		starcount--;
	}
	System.out.println("Program Ended");
	}
}
