import java.util.*;
class Soldier{
	public static void battleStatus(){
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int arr[]=new int[x];
		int count1=0,count2=0;
		for (int i=0;i<x ;i++ ) {
			arr[i]=sc.nextInt();
			if((arr[i]%2)==0){
				count1++;
				
			}
			else if ((arr[i]%2)!=0){
				count2++;
				
			}
		}
		if(count1>count2){
			System.out.println("READY FOR BATTLE");
		}
		else{
			System.out.println("NOT READY");
		}
	}
	public static void main(String[] args) {
		Soldier s=new Soldier();
		s.battleStatus();	
	}
}