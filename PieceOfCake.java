import java.util.*;
import java.lang.*;
/*
this program checks whether the count of the most occuring charachter in the string is equal to the sum of count of other
 characters in the String*/
class LCH15JAB{
	public static void main(String[] args) {
		try{Scanner sc=new Scanner(System.in);
		int testCase=sc.nextInt();
		for(int i=0;i<testCase;i++){
			String s=sc.next();
			StringBuffer let=new StringBuffer();
			int sum=0;
			int min=Integer.MIN_VALUE;
			System.out.println("1");
			HashMap<Character,Integer> hm=new HashMap<Character,Integer>(s.length());
			for(int j=0;j<s.length();j++)
				{
					if(hm.containsKey(s.charAt(j))!=true)
					{
						hm.put(s.charAt(j),1);
					}
					else
					{
						hm.put(s.charAt(j),hm.get(s.charAt(j))+1);
					}
				}
				System.out.println(hm);
				for (char letter : hm.keySet())
				{
					if(hm.get(letter)>min)
					{
						min=hm.get(letter);
						let.insert(0,letter);
					}
				}
				System.out.println(min+" "+let);
				for (char letter : hm.keySet()){
					if(letter!=let.toString().charAt(0)){
						sum+=hm.get(letter);
					}
				}
				System.out.println(sum);
				if(min==sum){
					System.out.println("YES");
				}
				else{
					System.out.println("NO");
				}
		}
	}catch(Exception e){
		System.out.println("some error occured");
	}
		
	}
	}
