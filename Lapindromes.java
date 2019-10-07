//we can't use equals() method in Lapindromes code as the equals method takes in account the length,characters,frequency of characters and order of characters in the string and thus when we compare the substrings for testing in which all the comditions are met then we are only testing for the very shallow success scenario where as we need to check for the failing scenario as well

import java.util.*;
class Lapin{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// 	String str=sc.nextLine();
		// System.out.println(str.length()+" "+str.substring(0,(str.length()/2))+" "+str.substring((str.length()/2)+1,str.length()));

		int test=sc.nextInt();
		for(int i=0;i<test;i++){
			int flag=10;
			String str=sc.next();
			if(str.length()%2==0){
				String str1=str.substring(0,(str.length()/2));
				String str2=str.substring((str.length()/2),str.length());
				String str11[]=str1.split("");
				String str22[]=str2.split("");
				Arrays.sort(str11);
				Arrays.sort(str22);
				// System.out.println(Arrays.toString(str11)+" "+Arrays.toString(str22));
				for(int j=0;j<str11.length;j++){
					// System.out.println(str11[j]+" "+str22[j]);
					if(str11[j].equals(str22[j]))
					{//System.out.println("YES");
						flag=1;
					}
				else{
					//System.out.println("NO");
						flag=0;
						break;
					}
					// System.out.println(flag);
				}
				if(flag==0)
					System.out.println("NO");
				else
					System.out.println("YES");
				
			}
			else{
				String str1=str.substring(0,(str.length()/2));
				String str2=str.substring((str.length()/2)+1,str.length());
				String str11[]=str1.split("");
				String str22[]=str2.split("");
				Arrays.sort(str11);
				Arrays.sort(str22);
				// System.out.println(Arrays.toString(str11)+" "+Arrays.toString(str22));
				for(int j=0;j<str11.length;j++){
					// System.out.println(str11[j]+" "+str22[j]);
					if(str11[j].equals(str22[j]))
					{//System.out.println("YES");
						flag=1;
					}
				else{
					//System.out.println("NO");
						flag=0;
						break;
					}
					// System.out.println(flag);
				}
				if(flag==0)
					System.out.println("NO");
				else
					System.out.println("YES");
					
			}
		}
	}
}