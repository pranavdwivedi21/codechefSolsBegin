/*to search the maximum no of houses safe for the thief*/
import java.util.*;

class Cops{

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for (int i=0;i<n;i++)
	{
		int housesOfCops=sc.nextInt();
		int housePerMinute=sc.nextInt();
		int limit=sc.nextInt();
		int copsHouse[]=new int[housesOfCops];
		for(int j=0;j<housesOfCops;j++)
		{
			
			copsHouse[j]=sc.nextInt();
			System.out.println(copsHouse[j]+" "+j); 
		}
		//Arrays.sort(copsHouse);
		for(int j=0;j<housesOfCops;j++)
		{
			
			System.out.println(copsHouse[j]+" "+j); 
		}
		int unsafehouse=0;
		int lowerLimit=1;
		int upperLimit=0;
		for (int j=0;j<housesOfCops;j++)
		{	
			int totalHousesLimit=housePerMinute*limit;
			System.out.println(upperLimit+" "+lowerLimit+"ifneo"+" "+totalHousesLimit+"thneo"+" "+copsHouse[j]+"chneo"+" "+j+"jneo"+" ");
			if(totalHousesLimit>copsHouse[j]){
				upperLimit=totalHousesLimit+copsHouse[j];
				lowerLimit=1;
				System.out.println(upperLimit+" "+lowerLimit+"ifneo1"+" "+totalHousesLimit+"thneo1"+" "+copsHouse[j]+"chneo1"+" "+j+"jneo1"+" ");
			}
			else if(totalHousesLimit<copsHouse[j]){

				int upperLimit1=totalHousesLimit+copsHouse[j];
				int lowerLimit1=copsHouse[j]-totalHousesLimit;
				if(lowerLimit1<=upperLimit){
					upperLimit=upperLimit1;
					unsafehouse=0;
				}
				else{
					upperLimit=upperLimit1;
					lowerLimit=lowerLimit1;
				}
				System.out.println(upperLimit+" "+lowerLimit+"ifneo2"+" "+totalHousesLimit+"thneo2"+" "+copsHouse[j]+"chneo2"+" "+j+"jneo2"+" ");
			}
			if(upperLimit>100)
				upperLimit=100;
			if(lowerLimit<0)
				lowerLimit=1;
			unsafehouse+=((upperLimit)-(lowerLimit))+1;	
			System.out.println(upperLimit+" "+lowerLimit+"ifneo4"+" "+unsafehouse);
		}
		if(unsafehouse<=100 && unsafehouse>0){
		int safeHouse=100-unsafehouse;
		System.out.println(safeHouse);
		}
		if (unsafehouse>100){ 
			System.out.println(0);
		}
		}
				
	}
	/*Cops c=new Cops();
	c.safeHouse();*/
}
