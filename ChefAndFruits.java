import java.util.*;
class ChefAndFruits{
	static int differnce(int app,int ora,int coi){
		int fru=0;
		if(app>ora){
			fru=app-ora;
			if(coi>fru){
				ora+=fru;
			}
			else{
				ora+=coi;
			}
			 return app-ora;
		}
		else{
			fru=ora-app;
			if(coi>fru){
				app+=fru;
			}
			else{
				app+=coi;
			}
			return ora-app;
		}
	}
	
	static void calculate(){
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		for (int i=0;i<n ;i++ ) {
			
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			System.out.println(differnce(a,b,c));
			
		}
			

		}
	
	public static void main(String[] args) {
		ChefAndFruits caf=new ChefAndFruits();
		caf.calculate();
	}
}