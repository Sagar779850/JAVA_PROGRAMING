package stringProgramming;

public class CalculateLength {

	public static void main(String[] args)
	{
	System.out.println("Program Started");
	String str="programming";
	System.out.println("---Approach1---");
	System.out.println("length of string is : "+str.length());
	System.out.println("---Apprach2---");
	char[] charr=str.toCharArray();
	int count=0;
	for(int i=0;i<=charr.length-1;i++)
	{
		count++;
	}
	System.out.println(count);
	System.out.println("Program Ended");
	}
}
