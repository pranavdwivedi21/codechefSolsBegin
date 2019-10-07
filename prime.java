import java.util.*;
class Prime{
	static Scanner sc=new Scanner(System.in);
	public static void  prime(int n){
		
		for(int i=0;i<n;i++){
			int x=sc.nextInt();
			boolean count=false;
			for(int j=2;j<=x/2;j++)
			{
				if(x%j==0)
				{
					count=true;
					break;
				}
			}
			if(!count)
				System.out.println("yes");
			else
				System.out.println("no");

			}
	}
	public static void main(String args[]){
		int n=sc.nextInt();
		Prime p=new Prime();
		p.prime(n);

	}
}