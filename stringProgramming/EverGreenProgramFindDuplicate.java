package stringProgramming;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EverGreenProgramFindDuplicate {

	public static void main(String[] args)
	{
	System.out.println("Program Started");	
	String s1="I LOVE MY MY INDIA INDIA";
	String[] words=s1.split(" ");
	Map<String, Integer> wordsmap=new HashMap<String,Integer>();
	for(int i=0;i<=words.length-1;i++)
	{
		if(wordsmap.get(words[i])==null)
		{
		   wordsmap.put(words[i],1);	
		}
		else
		{
			Integer v1=wordsmap.get(words[i]);
			v1++;
			wordsmap.put(words[i], v1);
		}
	}
	System.out.println(wordsmap);
	System.out.println("----Duplicate----");
	Set<String> keys= wordsmap.keySet();
	for(String k1 : keys)
	{
		if(wordsmap.get(k1)>1)
		{
			System.out.println(k1+"\t"+wordsmap.get(k1));
		}
	}
	System.out.println("Program Ended");
	}
}

