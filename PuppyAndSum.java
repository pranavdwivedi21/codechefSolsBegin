import java.util.*;
class PuppyAndSum{
	static int sum(int a,int b){
		if(a==0){return b;}
		return sum(a-1,b*(b+1)/2);
	}

	static void calculate(){
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		for (int i=0;i<n ;i++ ) {
			
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println(sum(a,b));
			
		}
			

		}
	
	public static void main(String[] args) {
		PuppyAndSum pas=new PuppyAndSum();
		pas.calculate();
	}
}