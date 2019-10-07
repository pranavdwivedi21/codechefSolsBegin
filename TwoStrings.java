import java.util.*;
class TwoStrings{

	static void calculate(){
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		for (int i=0;i<n ;i++ ) {
			int mindiff=0,maxdiff=0;
			String a=sc.next();
			String b=sc.next();
			for(int j=0;j<a.length();j++){
			if(
			(a.charAt(j)=='?'||b.charAt(j)=='?')
				){
				
				continue;	
			}
			else{
				if(a.charAt(j)!=b.charAt(j)){
				mindiff++;
				
				}
				if (a.charAt(j)==b.charAt(j)) {
				maxdiff++;
				}
			}

			}
			maxdiff=a.length()-maxdiff;
			
			System.out.println(mindiff+" "+maxdiff);			
		}
	}
	public static void main(String[] args) {
		TwoStrings ts=new TwoStrings();
		ts.calculate();
	}
}