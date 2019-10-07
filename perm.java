import java.util.*;
class Perm
{
public static void main(String []args)
	{
	Scanner sc=new Scanner(System.in);
	int a,n;
	do
		{
			n=sc.nextInt();
			if(n==0)
				break;
			int arr[]=new int[n];
			int brr[]=new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			for(int i=0;i<n;i++)
			{
				int num=arr[i];
				brr[num-1]=i+1;
			}
			if(Arrays.equals(arr,brr))
				{
					System.out.println("ambiguous");
				}
			else
				{
					System.out.println("not ambiguous");
				}
		}while(n!=0);	

	}
}