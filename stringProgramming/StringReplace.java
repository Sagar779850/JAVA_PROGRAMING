package stringProgramming;

public class StringReplace {

	public static void main(String[] args)
	{
	System.out.println("Program Started");
	String str="love is mava and mava is marjava";
	String[] factor=str.split("mava");
	for(int i=0;i<=factor.length-1;i++)
	{
		System.out.print(factor[i]);
		if(i!=factor.length-1)
		{
		System.out.print("java");	
		}
	}
	System.out.println("\n Program Ended");
	}
}

