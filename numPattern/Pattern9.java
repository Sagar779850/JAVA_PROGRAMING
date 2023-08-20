package numPattern;

public class Pattern9 {

	public static void main(String[] args)
	{
	System.out.println("Program Started");
	int line=5;
	int numcount=1;
	int num=1;
	int mid=(line+1)/2;
	for(int i=1;i<=line;i++)
	{
		for(int j=1;j<=numcount;j++)
		{
			System.out.print(num);
			num++;
		}
		System.out.println();
		num=1;
		if(i<mid)
		{
			numcount++;
		}
		else
		{
			numcount--;
		}
	}
	System.out.println("Program Ended");
  }
}
