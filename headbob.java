import java.util.*;
class HeadBob{
	 static Scanner sc=new Scanner(System.in);
	public void selectBob(){
		int x=sc.nextInt();
		for (int i=0;i<x ;i++ ) {
			boolean flag1=false,flag2=true;
			int n=sc.nextInt();
			String s=sc.next();
			for(int j=0;j<s.length();j++){
				if(s.charAt(j)=='I'){
					flag1=true;
				}
				else if(s.charAt(j)=='Y'){
					flag2=false;
				}
			}
			if (flag1==true) {				System.out.println("INDIAN");}
			else if(flag2==false){			System.out.println("NOT INDIAN");}
			else {							System.out.println("NOT SURE");}
					
		}
	}
	public static void main(String[] args) {
		HeadBob hb=new HeadBob();
		hb.selectBob();
		sc.close();

	}
}