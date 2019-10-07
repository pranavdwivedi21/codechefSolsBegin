import java.util.*;
  class Op{
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	for(int i=0;i<n;i++){
		int a=s.nextInt();
		int b=s.nextInt();
		//char x=s.next().charAt(0);
		if(a>b){
			System.out.println(">");
		}
		else if(a<b){
			System.out.println("<"); 
		}
		else if(a==b){
			System.out.println("="); 
		}
		
		}

	}
	 
	}
	 
