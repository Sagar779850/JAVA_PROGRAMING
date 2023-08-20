package Loopingstatement;

public class PatternDowhileloop {

	public static void main(String[] args)
	{
	System.out.println("Program Started");
	int line=5;
	int starcount=1;
	String str="*";
	do
	{
		System.out.println(str);
		str=str+"*";
		starcount++;
	}while(starcount<=line);
	System.out.println("Program Ended");
	}
}
