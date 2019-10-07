import java.util.*;
class Recipe
{
	    static int gcd(int a,int b){
				if(a==0)
				return b;
				return	gcd(b%a,a);
	}
public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int a,result=0,n1=0;
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			a=sc.nextInt();
			int arr[]=new int[a];
			for(int j=0;j<arr.length;j++)
			{
				arr[j]=sc.nextInt();
				if(i==0)
					result=arr[0];
				result=gcd(arr[j],result);
			}
				if(result>1)
				{
					for(int j=0;j<arr.length;j++)
					{				
						arr[j]=arr[j]/result;		
					}
				}
				for(int j=0;j<arr.length;j++){
					System.out.print(arr[j]+" ");
				}			
			result=0;
		}
			
		}


}