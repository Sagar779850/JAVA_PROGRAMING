package rough;

public class FibnocciSerieswithrecurssion {

	static int a=0,b=1,c=0;
	public static void main(String[] args)
	{
	System.out.println("Program Started");
	FibnocciSerieswithrecurssion f1=new FibnocciSerieswithrecurssion();
	f1.fibrec(8);
	System.out.println("\nProgram Ended");
	}
	public void fibrec(int i)
	{
		if(i>=1)
		{
			System.out.print(a+",");
			c=a+b;
			a=b;
			b=c;
			fibrec(i-1);
		}
	}
}
