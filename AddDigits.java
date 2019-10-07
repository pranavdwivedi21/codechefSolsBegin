import java.util.*;
class AddDigits
{
public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int a,count,c=0,b1;
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			a=sc.nextInt();
			int b=0;
				b=a%10;
				a=a/10;
				do{
					b1=a%10;
					a=a/10;
					if(a==0)
						c=b1;
				}while(a!=0);
				c=c+b;
				System.out.println(c);		
			}
			
		}


}