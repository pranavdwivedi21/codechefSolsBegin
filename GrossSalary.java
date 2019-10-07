import java.util.*;
 class GrossSalary{
 	static Scanner sc =new Scanner(System.in);
 	static void calculator(){
 		int n=sc.nextInt();
 		for (int i=0;i<n ;i++ ) {
 			int bs=sc.nextInt();
 			if(bs<1500){
 				double hra=0.1*bs;
 				double da=0.9*bs;
 				System.out.println(bs+hra+da);

 			}
 			else{
 				int hra=500;
 				double da=0.98*bs;
 				System.out.println(bs+hra+da);


 			}
 		}

 	}
 	public static void main(String[] args) {
 		GrossSalary gs=new GrossSalary();
 		gs.calculator();
 	}
 }