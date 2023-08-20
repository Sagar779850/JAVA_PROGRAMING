package rough;

public class PalimdromeString {

	public static void main(String[] args)
	{
	System.out.println("program Started");
	String str="madam";
	String revstr="";
	char[] charr=str.toCharArray();
	for(int i=charr.length-1;i>=0;i--)
	{
		revstr=revstr+charr[i];
	}
	System.out.println("Given a String : "+str);
	System.out.println("Reverse a String : "+revstr);
	if(str.equals(revstr))
	{
		System.out.println(str+" : Palimdrome String!!");
	}
	else
	{
		System.out.println(str+" : Not Palimdrome String!!");
	}
	System.out.println("program Ended");
	}
}
