import java.util.*;
class Palindrome{
	static Scanner sc=new Scanner(System.in);
	public static void  palin(int n){
		for(int i=0;i<n;i++){
			String x=sc.next();
			StringBuilder xx=new StringBuilder();
			xx.append(x);
			String y=xx.reverse().toString();
			int xxx=Integer.parseInt(x);
			int yyy=Integer.parseInt(y);
			if(xxx==yyy)
				System.out.println("wins");
			else
				System.out.println("losses");
			}
	}
	public static void main(String args[]){
		int n=sc.nextInt();
		Palindrome p=new Palindrome();
		p.palin(n);

	}
}