import java.util.*;

class Flow{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=0;i<n;i++){
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	if(a<b&&a>c||a<c&&a>b){System.out.println(a);}
	
	else if(b<a&&b>c||b<c&&b>a)
	{System.out.println(b);}
	else if(c<b&&c>a||c<a&&c>b)
	{System.out.println(c);}
	
	}
}
}