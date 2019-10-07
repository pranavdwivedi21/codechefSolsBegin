import java.util.*;
class Ciel
{
public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int a,count;
		int arr[]={1,2,4,8,16,32,64,128,256,512,1024,2048};
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{	a=sc.nextInt();
			count=0;
			while(a!=0)
			{
				for(int j=arr.length-1;j>=0;j--)
				{
					if(a>=arr[j])
					{
					a=a-arr[j];
					count++;
					break;

					}

				}				
			}
			System.out.println(count);
		}
	}
}