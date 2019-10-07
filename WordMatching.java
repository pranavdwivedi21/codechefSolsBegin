import java.util.*;
class WildcardMatching{
	static String check(String a,String b){
		boolean notmatched=false;
		if(a.length()!=b.length())
			return "No";
		for (int i=0;i<a.length();i++ ) {
		if(a.charAt(i)!='?'&&b.charAt(i)!='?'&&a.charAt(i)!=b.charAt(i)){
			notmatched=true;
		}		
	}
	if(notmatched==false)
		{return "Yes";}
	else
		return "No";
}	
	static void calculate(){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for (int i=0;i<n ;i++ ) {			
			String a=sc.next();
			String b=sc.next();
			System.out.println(check(a,b));			
		}
	}	
	public static void main(String[] args) {
		WildcardMatching wm=new WildcardMatching();
		wm.calculate();
	}
}