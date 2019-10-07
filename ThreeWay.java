import java.util.*;
 
class ThreeWay{
	static Scanner sc=new Scanner(System.in);
	static void func1(int n){
	for(int i=0;i<n;i++){
	int a=sc.nextInt();
	int b1=sc.nextInt();
	int c1=sc.nextInt();
	int b2=sc.nextInt();
	int c2=sc.nextInt();	
	int b3=sc.nextInt();
	int c3=sc.nextInt();
	int r0=a*a;
	double r1=Math.pow((b2-b1),2)+Math.pow((c2-c1),2);
	double r2=Math.pow((b3-b2),2)+Math.pow((c3-c2),2);
	double r3=Math.pow((b1-b3),2)+Math.pow((c1-c3),2);
	if(r1<=r0&&r2<=r0||r2<=r0&&r3<=r0||r1<=r0&&r3<=r0){
	 	System.out.println("yes");
	 }
	
	 else{System.out.println("no");}

	}
 
	}

public static void main(String args[]) throws Exception{
	
	int n=sc.nextInt();
	ThreeWay tw=new ThreeWay();
	tw.func1(n);
	
	}
		
}