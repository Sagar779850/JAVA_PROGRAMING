package alphaPattern;

public class Pattern8 {

	public static void main(String[] args)
	{
	System.out.println("Program Started");
	int line=5;
	int charcount=1;
	char ch='A';
	int mid=(line+1)/2;
	for(int i=1;i<=line;i++)
	{
		for(int j=1;j<=charcount;j++)
		{
			System.out.print(ch);
		}
		System.out.println();
		if(i<mid)
		{
			charcount++;
		}
		else
		{
			charcount--;
		}
	}
	System.out.println("Program Ended");
	}
}
