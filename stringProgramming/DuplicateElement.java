package stringProgramming;

public class DuplicateElement {

	public static void main(String[] args)
	{
	System.out.println("Program Started");
	int[] arr1={1,2,3,4,7,5,4,6,2,7};
	for(int i=0;i<=arr1.length-1;i++)
	{
		for(int j=i+1;j<=arr1.length-1;j++)
		{
			if(arr1[i]==arr1[j])
			{
			System.out.print(arr1[j]+",");	
			}
		}
	}
	System.out.println("\nprogram Ended");
	}
}
