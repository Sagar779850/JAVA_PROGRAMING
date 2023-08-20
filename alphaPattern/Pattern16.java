package alphaPattern;

public class Pattern16 {

	public static void main(String[] args)
	{
	System.out.println("Program Started");
	int line=5;
	int charcount=1;
	char ch='A';
	int spacecount=2;
	int mid=(line+1)/2;
	for(int i=1;i<=line;i++)
	{
		for(int j=1;j<=charcount;j++)
		{
			System.out.print(ch);
		}
		for(int k=1;k<=spacecount;k++)
		{
		System.out.print(" ");	
		}
		for(int l=1;l<=charcount;l++)
		{
			System.out.print(ch);
		}
		System.out.println();
		if(i<mid)
		{
			charcount++;
			spacecount--;
		}
		else
		{
			charcount--;
			spacecount++;
		}
	}
	System.out.println("Program Ended");
	}
}
