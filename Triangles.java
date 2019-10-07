import java.util.*;
class Triangles
{
	static Scanner sc=new Scanner(System.in);
	public void square(){
		
		int n=sc.nextInt();
		for (int i=0;i<n ;i++ ) 
		{
			int base=sc.nextInt();
			
			int noofsq=func(base); 
			System.out.println(noofsq);
		}
	}
	int func(int b){
		int fb=0;

		return fb=((b/2)*((b/2)-1))/2;
	}
public static void main(String []args)
	{
		
		
		Triangles tri=new Triangles();
		tri.square();
		sc.close();

}
}