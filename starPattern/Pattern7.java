package starPattern;

public class Pattern7 {

	public static void main(String[] args)
	{
	System.out.println("Program Started");
	int line=5;
	int starcount=1;
	int spacecount=4;
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
		starcount++;
		spacecount--;
	}
	System.out.println("Program Ended");
	}
}
