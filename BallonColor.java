import java.util.*;
class BallonColor{

	static void calculate(){
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		for (int i=0;i<n ;i++ ) {
			int counta=0,countb=0;
			String a=sc.next();			
			for(int j=0;j<a.length();j++){
			if(
			(a.charAt(j)=='a')
				){				
				counta++;	
			}
			else{
				countb++;
			}

			}
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
		BallonColor bc=new BallonColor();
		bc.calculate();
	}
}