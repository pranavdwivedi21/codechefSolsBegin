import java.io.*;
import java.util.*;
import java.lang.*;
 
public class atm{
	public static void main(String args[])
	{
	
	Scanner s=new Scanner(System.in);
	double x=s.nextDouble();
	double y=s.nextDouble();
	if(y<=x+0.5 && ((x+0.5)%5)==0)
	{
		y=y-x-0.5;
	}
		
	System.out.println("successful"+y);
	 
	}
	} 
