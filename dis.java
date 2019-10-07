import java.util.*;
import java.math.*;
class Dis{
	static Scanner sc=new Scanner(System.in);
	public double totalprice(double q,double p){
			double tp=(double)q*p;
			if (q>1000) {
				
			tp-=tp/10;
			
			return tp;
			}
			else{
			return tp;
			}
			
	}
	public void calculate(){
		int x=sc.nextInt();
		for (int i=0;i<x ;i++ ) {
			
			int quantity=sc.nextInt();
			int price=sc.nextInt();
			System.out.printf("%.6f\n",totalprice(quantity,price));
			}
	}
	public static void main(String[] args) {
		Dis d=new Dis();
		d.calculate();
		sc.close();

	}
}