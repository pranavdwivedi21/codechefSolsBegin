import java.util.*;
import java.lang.*;

class TRICOIN{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int testCase=sc.nextInt();
		for(int i=0;i<testCase;i++){
			int noOfCoins=sc.nextInt();
			int h=1;
			while(((h*(h+1))/2)<=noOfCoins)
				{h++;}
			System.out.println(h-1);
		}
	}
}