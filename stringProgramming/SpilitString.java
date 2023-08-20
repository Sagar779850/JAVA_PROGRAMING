package stringProgramming;

public class SpilitString {

	public static void main(String[] args)
	{
	System.out.println("program Started");
	String str="Java_Hibernate_Spring_J2EE_WebTech_SQl";
	String[] strarr=str.split("_");
	for(int i=1;i<=strarr.length-1;i++)
	{
		System.out.println(strarr[i]);
	}
	System.out.println("Program ENded");
	}
}
