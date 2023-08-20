package starPattern;

public class Pattern11 {

	public static void main(String[] args)
	{
	System.out.println("Program Started");
	int line=5;
	int starcount=9;
	int spacecount=0;
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
		starcount=starcount-2;
		spacecount++;
	}
	System.out.println("Prrogram Ended");
	}
}
