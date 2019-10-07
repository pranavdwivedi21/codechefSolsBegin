import java.util.*;
class GreedyPuppy{
	static Scanner sc= new Scanner(System.in);
	 void calculate(){
		int t=sc.nextInt();
		for (int i=0;i<t ;i++ ) {
			int n=sc.nextInt();
			int k=sc.nextInt();
			int r=0,r1=0;
			int[] arr=new int[k];
			for (int j=1;j<=k ;j++ ) {
				r=n%j;
				if(r>r1){
					r1=r;
				}

			}
			
			
			//int r=(n-k)*(n/k);
			System.out.println(r1);
		}
	}
	public static void main(String[] args) {
		GreedyPuppy gp=new GreedyPuppy();
		gp.calculate();
		sc.close();
		}
}