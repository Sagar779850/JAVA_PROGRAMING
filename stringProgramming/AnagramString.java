package stringProgramming;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args)
	{
	System.out.println("Program Started");
	
	String s1="rat";
	String s2="art";
	
	char[] charr1=s1.toCharArray();
	char[] charr2=s1.toCharArray();
	
	
	Arrays.sort(charr1);
	Arrays.sort(charr2);
	
	boolean b=Arrays.equals(charr1,charr2);
	if(b==true)
	{
	System.out.println("String is Anagram!!");	
	}
	else
	{
	System.out.println("String is not Anagram!!");	
	}
	System.out.println("Program Ended");
	}
}
