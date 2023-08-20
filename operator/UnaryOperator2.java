package operator;

public class UnaryOperator2 {

	public static void main(String[] args)
	{
	System.out.println("Program Started");
	
	int i=0;
	int j=0;
	
	//pre increment(firest use the current value and increment the value)
	
	j=i++ + i++;
	
	System.out.println("i ka value :"+i);
	System.out.println("j ka value :"+j);
	
	System.out.println("Program Ended");
	
	}
}
