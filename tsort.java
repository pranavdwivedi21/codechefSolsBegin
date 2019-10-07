import java.util.*;
class tsort
{
	public static void main(String []args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr1[]=new 	int[n];

		for(int i=0;i<n;i++)
		{		
			arr1[i]=sc.nextInt();

		}
		Arrays.sort(arr1);
		/*ts.sorts(arr1);*/			
		for(int i=0;i<n;i++){
			System.out.println(arr1[i]);
		}
	}
			
}