package alphaPattern;

public class Pattern11 {

	public static void main(String[] args)
	{
	System.out.println("Program Started");
	int line=5;
	int charcount=1;
	char ch='A';
	int spacecount=0;
	int mid=(line+1)/2;
	for(int i=1;i<=line;i++)
	{
		for(int j=1;j<=spacecount;j++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=charcount;k++)
		{
			System.out.print(ch);
		    ch++;
		}
		System.out.println();
		ch='A';
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
