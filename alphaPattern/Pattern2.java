package alphaPattern;

public class Pattern2 {

	public static void main(String[] args)
	{
	System.out.println("Program Started");
	int line=5;
	int charcount=5;
	char ch='A';
	for(int i=1;i<=line;i++)
	{
		for(int j=1;j<=charcount;j++)
		{
			System.out.print(ch);
			ch++;
		}
		System.out.println();
		ch='A';
	}
	System.out.println("Program Ended");
	}
}
