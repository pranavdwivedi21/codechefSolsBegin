import java.util.*;
class SumDigits
{
public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int a=0,b=0,c=0;
			a=sc.nextInt();
			while(a>0){
			b=a%10;
			c=c*10+b;
			a=a/10;
			}
		System.out.println(c);
		}
}}