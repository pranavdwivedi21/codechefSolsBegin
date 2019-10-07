import java.util.*;
import java.lang.*;

class DecInc{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%4==0){
			n=n+1;
			
		}
		else{
			n=n-1;
			
		}
		System.out.print(n);
	}
}