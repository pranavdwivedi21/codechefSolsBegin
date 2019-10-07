import java.util.*;

class Remiss
{
public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			double a=0;
			a=sc.nextDouble();
			int sqrt=(int)Math.floor(Math.sqrt(a));
			System.out.println(sqrt);
		
		}
}}