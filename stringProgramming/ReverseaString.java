package stringProgramming;

public class ReverseaString {

	public static void main(String[] args)
	{
    System.out.println("Program Started");
    String str="JAVA";
    String revstr="";
    char[] charr=str.toCharArray();
    for(int i=charr.length-1;i>=0;i--)
    {
    	revstr=revstr+charr[i];
    }
    System.out.println("Given String is : "+str);
    System.out.println("Reverse a String is : "+revstr);
    System.out.println("Program Ended");
	}
}

