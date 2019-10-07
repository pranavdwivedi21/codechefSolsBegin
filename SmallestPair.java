import java.util.*;
import java.io.*;
class Smallest{
	Scanner sc= new Scanner(System.in);
	void begin(){
		int t=sc.nextInt();
		for (int i=0;i<t ;i++ ) {
		  	int n=sc.nextInt();
		  	int max1=Integer.MAX_VALUE,max2=Integer.MAX_VALUE;
			int arr1[]=new int[n];
			//int arr2[]=new int[n-1];
			for (int j=0;j<n;j++ ) {
				arr1[j]=sc.nextInt();
				}
			//for (int j=0;j<n-1 ;j++ ) {
			//	arr2[j]=arr1[j]+arr1[j+1];
			//}
			//Arrays.sort(arr2);
			//System.out.println(arr2[0]);
			//}
			for(int j=0;j<n;j++){
				if (max1>arr1[j]) {
					max2=max1;
					max1=arr1[j];
				}
				else if (max1!=arr1[j]&&max2>arr1[j]) {
					max2=arr1[j];
				}
			}
			System.out.println(arr1[0]+arr1[1]);
		}}
	public static void main(String args[]){
		Smallest s=new Smallest();
		s.begin();
	}
}