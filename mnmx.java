import java.lang.*;
	import java.util.*;
	import java.math.*;
	class MinMax{
		// public int noGenerator(int limit){
		// 	for(int i=0;i<=limit;i++){

		// 	}
		// }

		public static void main(String args[])
		{	
		try{
		// long time1=System.currentTimeMillis();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int k=0;k<n;k++){
		int length=s.nextInt();
		int[] minmax=new int[length];
		int minele=Integer.MAX_VALUE;
		for(int i=0;i<length;i++)
		{	
			minmax[i]=s.nextInt();
			if(minmax[i]<minele)
				minele=minmax[i];
		}	
		/*for optimum solution
		BigInteger min=BigInteger.valueOf(minele);
		BigInteger len=BigInteger.valueOf((minmax.length-1));
		BigInteger cost=min.multiply(len);*/	
		BigInteger cost=BigInteger.valueOf((minmax.length-1)*minele);	
		System.out.println(cost);
			
	}

		s.close();
		}
		catch(Exception e){}

				//long time2=System.currentTimeMillis();
		//System.out.println(time1+" "+time2);
			// try
	  //   {
	  //   	long time1=System.currentTimeMillis();
	  //       Scanner sc = new Scanner(System.in);
		 //    int T=sc.nextInt();
   //  	    while(T>0)
   //  	    {
   //  	        int n=sc.nextInt();
   //  	        int arr[] = new int[n];
   //  	        int min = Integer.MAX_VALUE;
   //  	        for( int i=0;i<n;i++)
   //  	        {
   //  	            arr[i]=sc.nextInt();
   //  	            if(arr[i]<min)
   //  	            min=arr[i];
   //  	        }
   //  	        BigInteger a = BigInteger.valueOf(min);
   //  	        BigInteger b = BigInteger.valueOf(n-1);
	  //           BigInteger c = a.multiply(b);
	  //           System.out.println(c);
	  //           T--;
	  //       }
	  //       long time2=System.currentTimeMillis();
			// System.out.println(time1+" "+time2);
	  //   }
	  //   catch(Exception e){}
		}
		}