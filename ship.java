import java.util.*;
  class Ship{
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	for(int i=0;i<n;i++){
		char x=s.next().charAt(0);
		if(x=='b'||x=='B'){
			System.out.println("BattleShip");
		}
		else if(x=='c'||x=='C'){
			System.out.println("Cruiser"); 
		}
		else if(x=='d'||x=='D'){
			System.out.println("Destroyer"); 
		}
		else if(x=='f'||x=='F'){
			System.out.println("Frigate"); 
		}
		}

	}
	 
	}
	 
