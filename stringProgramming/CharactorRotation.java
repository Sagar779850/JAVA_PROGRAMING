package stringProgramming;

public class CharactorRotation {

	public static void main(String[] args)
	{
	System.out.println("Program Started");
	String str="love";
	char[] charr=str.toCharArray();
	for(int i=0;i<=charr.length-1;i++)
	{
		int index=i;
		for(int j=0;j<=charr.length-1;j++)
		{
			System.out.print(charr[index]);
			index++;
			index=index%4;
		}
		
		System.out.println();
	}
	System.out.println("Program Ended");
	}
}
