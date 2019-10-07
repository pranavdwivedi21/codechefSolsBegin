import java.lang.*;
import java.util.*;

class Missp{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++){
			int n=s.nextInt();
			int[] dollArrey=new int[n];
			for(int j=0;j<dollArrey.length;j++){
				dollArrey[j]=s.nextInt();
			} 
			int fin=0;
			for(int j=0;j<dollArrey.length;j++){
				for(int k=j+1;k<dollArrey.length;k++){
					int count=0;
					System.out.println(dollArrey[j]+" "+j+"j");
					System.out.println(dollArrey[k]+" "+k+"k");
					System.out.println(dollArrey[j]==dollArrey[k]);
					System.out.println("boolean");
					if(dollArrey[j]==dollArrey[k]){
						count=count+1;
						System.out.println(count+"count");
						if(count==2){//error line....ArrayIndexOutOfBoundsException: 1
							j=k+1;
							System.out.println(dollArrey[j]+"2");
							System.out.println(dollArrey[k]+"2");
						}
					}
					System.out.println(count+"count");
					System.out.println(dollArrey[j]+"dollArrey[j]"+j+"j");
					System.out.println(dollArrey[k]+"dollArrey[k]"+k+"k");
					
					}
				}
				System.out.println(fin+"4");
			}
		}
	}