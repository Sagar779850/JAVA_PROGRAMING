package operator;

public class Swappingwithout3Variable {

	public static void main(String[] args)
	{
	System.out.println("Program Started");
	
	int a=20;
	int b=30;
	
	System.out.println("---Before Swapping---");
	System.out.println("a ka value :"+a);
	System.out.println("b ka value :"+b);
	
	System.out.println("---After Swapping---");
	
	a=a+b;
	b=a-b;
	a=a-b;
	
	System.out.println("a ka value :"+a);
	System.out.println("b ka value :"+b);
	System.out.println("Program Ended");
	}
}
