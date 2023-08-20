package rough;

public class Factorialwithrecursion2 {

	static int fact=1;
	public static void main(String[] args)
	{
	System.out.println("Program Started");
	int no=5;
	Factorialwithrecursion2 f1=new Factorialwithrecursion2();
	f1.factrec(no);
	System.out.println("factorial of "+no+" is : "+fact);
	System.out.println("Program Ended");
	}
	public void factrec(int no)
	{
		if(no>1)
		{
			fact=fact*no;
			factrec(no-1);
		}
	}
}
