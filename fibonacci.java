import java.util.*;
class fibonacci{
	
	public static void fib(int n){
		int x=0;
		int y=1;
		System.out.println(x+"\n"+y);

		for(int i=0;i<n;i++){
			int z=x+y;
			x=y;
			y=z;
			System.out.print(z);

		}
	}
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		fibonacci f=new fibonacci();
		fib(n);

	}
}