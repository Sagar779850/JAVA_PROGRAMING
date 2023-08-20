

import java.util.Scanner;

public class  Test {

	public static void main(String[] args)
	{
	System.out.println("Program Started");	
	Scanner scan=new Scanner(System.in);
	System.out.println("Plz enter your Grade");
	char ch=scan.next().charAt(0);
    switch(ch)
    {
    case'A':System.out.println("FCD!!!");
           break;
         
    case'B':System.out.println("FC!!!");
           break;
           
    case'C':System.out.println("SC");       
           break;
           
    case'D':System.out.println("Get Loss");
           break;
           
    default:System.out.println("Plz Enter Grade between A to D");       
    }
    System.out.println("Program Ended");
	}
}
