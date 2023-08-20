package controlFlow;

import java.util.*;

public class Assignment {

	public static void main(String[] args)
	{
	System.out.println("Program Started");
	Scanner scan=new Scanner(System.in);
	System.out.println("Plz Enter Your username :");
	String username=scan.next();
	System.out.println("Plz Enter your password");
    String password=scan.next();
    String un="java";
    String pw="mava";
    if(username.equals(un) && password .equals(pw))
    {
       System.out.println("Welcome To Application :"+username);	
    }
    else
    {
    	System.out.println("Sorry!!! Plz provide valid username and password");
    }
    System.out.println("Program Ended");
	}
}
