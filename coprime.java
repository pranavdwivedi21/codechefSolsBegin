import java.util.*;
import java.io.*;
import java.lang.*;

public class CoPrime
{

	public static void main(String[] args) 
	{
		long start=System.currentTimeMillis();
		Scanner s= new Scanner(System.in);
		int [] co;
		System.out.println("enter the size of the series u want to check");
		int n= s.nextInt();

		co = new int[n];
		System.out.println("enter the series of numbers u want to check");

		for(int i=0;i<co.length;i++)
		{

			co[i]=s.nextInt();

		}
		System.out.println("the pahase one is complete");
		/*System.out.println("the values enterd are:");
		for (int i=0;i<co.length ;i++ ) {
			System.out.println(co[i]);
			
		}*/
	
	for (int i=0;i<co.length;i++) 
		{
			for(int j=1;j<co.length-i;j++)
			{
			if  (co[j-1]>co[j])
				{
					int temp=co[j-1];
					co[j-1]=co[j];
					co[j]=temp;
				}
			

			}
			
		}
		for (int k=0;k<co.length;k++){System.out.println("the elements are"+co[k]);}

			/*
		NOW TO CALL THE FUNCTION TO CHECK THE PAIS OF NUMBERS TO BE COPRIMES AND TO CHECK THE COUNT OF SUH PAIRS*/
			long end = System.currentTimeMillis();
		long duration=end-start;
		System.out.println(duration);
	}


}