package alphaPattern;

public class Pattern5 {

	public static void main(String[] args)
	{
	System.out.println("Program Started");
	int line=5;
	int charcount=5;
	char ch='E';
	for(int i=1;i<=line;i++)
	{
		for(int j=1;j<=charcount;j++)
		{
			if(j==1 || j==charcount || i==1 || i==line)
			{
			System.out.print(ch);
			}
			else
			{
			System.out.print(" ");	
			}
			ch--;
		}
		System.out.println();
		ch='E';
	}
	System.out.println("Program Ended");
	}
}
