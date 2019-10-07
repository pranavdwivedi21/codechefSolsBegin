import java.util.*;
class LuckyFour
{
public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int a,count;
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			a=sc.nextInt();
			int b=0;
			count=0;
			do
			{
				
				b=a%10;
				if(b==4)
				count++;
				a=a/10;		
			}while(a!=0);
			System.out.println(count);
		}


}}