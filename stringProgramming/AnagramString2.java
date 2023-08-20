package stringProgramming;

import java.util.Arrays;

public class AnagramString2 {

	public static void main(String[] args)
	{
	System.out.println("Program Started");
	
	String s1="he is ANmol";
	String s2="is he anmol";
	
	s1=s1.replace(" "," ");
	s2=s2.replace(" "," ");
	
	s1=s1.toLowerCase();
	s2=s2.toLowerCase();
	
	char[] charr1=s1.toCharArray();
	char[] charr2=s2.toCharArray();
	
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
