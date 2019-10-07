import java.util.*;
class LeadGame
{
public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int a,b,ps1=0,ps2=0,w=0,l1=0,l2=0,m=0;
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			a=sc.nextInt();
			b=sc.nextInt();
			ps1+=a;
			ps2+=b;
			if(ps1>ps2)
			{
				l1=ps1-ps2;
			}
			else
			{
				l2=ps2-ps1;
			}
			if(l1>m)
			{
				w=1;
				m=l1;
			}
			if(l2>m)
			{
				w=2;
				m=l2;
			}
		}
System.out.println(w+" "+m);
}}