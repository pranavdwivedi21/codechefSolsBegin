	import java.lang.*;
	import java.util.*;
	class fact{
		public static void main(String args[])
		{	
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
		int num=s.nextInt();
		long fact=1;
		for(int j=1;j<=num;j++)
		{
			fact*=j;
		}
		System.out.println(fact);
		}
		s.close();
		}
		}   