import java.util.*;
class PairDolls{

	static void calculate(){
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		for (int i=0;i<n ;i++ ) {
			int counta=0,countb=0;
			int arraysize=sc.nextInt();
			int arr[]=new int[arraysize];			
			int countarr[]=new int[arraysize];
			for(int j=0;j<arraysize;j++){
				arr[j]=sc.nextInt();
			}
			Arrays.sort(arr);

			if(counta==0||countb==0)
				System.out.println("0");
			else if(counta==countb)
				System.out.println(counta);
			else if(counta>countb)
				System.out.println(countb);
			else{
				System.out.println(counta);			
			}
		}
	}
	public static void main(String[] args) {
		PairDolls bc=new PairDolls();
		bc.calculate();
	}
}