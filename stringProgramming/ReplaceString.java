package stringProgramming;

public class ReplaceString {

	public static void main(String[] args)
	{
	System.out.println("Program Started");
	String str="i am a very good enginner";
	String[] factor=str.split("very");
	for(int i=0;i<=factor.length-1;i++)
	{
		System.out.print(factor[i]);
		if(i!=factor.length-1)
		{
		System.out.print("very");	
		}
		System.out.println(factor[i]);
	}
	System.out.println("\nProgram Ended");
	}
}
