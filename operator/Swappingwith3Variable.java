package operator;

public class Swappingwith3Variable {

	public static void main(String[] args)
	{
	System.out.println("Program Started");
	
	int a=10;
	int b=20;
	int temp=0;
	
	System.out.println("---Before Swapping---");
    System.out.println("a ka value :"+a);
    System.out.println("b ka value :"+b);
    System.out.println("---After Swapping---");
	
    temp=a;
    a=b;
    b=temp;
    
    System.out.println("a ka value :"+a);
    System.out.println("b ka value :"+b);
    
    System.out.println("Program Ended");
	}
}
