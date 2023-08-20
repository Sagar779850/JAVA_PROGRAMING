package operator;

public class SwappingwithXORoperator {

	public static void main(String[] args)
	{
	System.out.println("Program Started");
	
	int i=12;
	int j=14;
	
	System.out.println("---Before Swapiing---");
	System.out.println("i ka value :"+i);
	System.out.println("k ka value :"+j);
	System.out.println("---After Swapping---");
	
	i=i^j;
	j=i^j;
	i=i^j;
	
	System.out.println("i ka value :"+i);
	System.out.println("j ka value :"+j);
	System.out.println("Program Ended");
	}
}
