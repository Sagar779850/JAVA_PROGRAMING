package numPattern;

public class Pattern6 {

	public static void main(String[] args)
	{
	System.out.println("Program Started");
	int line=5;
	int numcount=1;
	int num=1;
	int spacecount=4;
	for(int i=1;i<=line;i++)
	{
		for(int j=1;j<=spacecount;j++)
		{
		System.out.print(" ");	
		}
		for(int k=1;k<=numcount;k++)
		{
         System.out.print(num);			
		}
		System.out.println();
		spacecount--;
		numcount++;
	}
	System.out.println("Program Ended");
	}
}
