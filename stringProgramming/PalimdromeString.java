package stringProgramming;

public class PalimdromeString {

	public static void main(String[] args)
	{
	System.out.println("Program Started");
	String str="level";
	String revstr="";
	char[] charr=str.toCharArray();
	for(int i=charr.length-1;i>=0;i--)
	{
		revstr=revstr+charr[i];
	}
	System.out.println("Given a String : "+str);
	System.out.println("reverse a String : "+revstr);
	if(str.equals(revstr))
	{
		System.out.println(str+" : Palimdrome String!!");
	}
	else
	{
		System.out.println(str+" : Not palimdome String");
	}
	System.out.println("Program Ended");
	}
}
