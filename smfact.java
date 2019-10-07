import java.util.*;
 
class Flow{
public static void main(String args[]) throws Exception{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int s=1;
	for(int i=0;i<n;i++){
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	
	if(a+b+c==180&&((a>0)&&(b>0)&&(c>0)))
	{System.out.println("YES");}
else {System.out.println("NO");}
	}
 
	}
	
}