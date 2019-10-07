import java.util.*;
import java.math.*;
class GcdLcm{
	static Scanner sc=new Scanner(System.in);
	BigInteger gcd(int a,int b){
		BigInteger A=BigInteger.valueOf(a);
		BigInteger B=BigInteger.valueOf(b);
		BigInteger bb3=A.gcd(B);
		return bb3;
	}
	BigInteger lcm(int a,int b){
		BigInteger A=BigInteger.valueOf(a);
		BigInteger B=BigInteger.valueOf(b);
		BigInteger bb2=A.multiply(B);
		BigInteger bb3=A.gcd(B);
		return bb2.divide(bb3);
	}
	public void calculate(){
		int x=sc.nextInt();
		for (int i=0;i<x ;i++ ){
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println(gcd(a,b)+" "+lcm(a,b));
			}
	}
	public static void main(String[] args) {
		GcdLcm d=new GcdLcm();
		d.calculate();
		sc.close();

	}
}