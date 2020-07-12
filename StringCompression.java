import java.util.Scanner;

public class StringCompression {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ar[]=new int[26];
	System.out.println("Enter the string");
	String s=sc.next();
	for (int i = 0; i < s.length(); i++) {
	//	if(s.charAt(i)>='A'&& s.charAt(i)<='Z') {
			ar[s.charAt(i)-'a']++;
			
		//}
	//	if(s.charAt(i)>=97&& s.charAt(i)<=122) {
		//	a[s.charAt(i)-97]++;
		//}	
	}
	System.out.print(s.charAt(0));
	System.out.print(ar[s.charAt(0)-'a']);
	for (int i = 1; i < s.length(); i++) 
		 {
			if(s.charAt(i)==s.charAt(i-1))
			{
				
			}
			else
			{
				System.out.print(s.charAt(i));
				
				System.out.print(ar[s.charAt(i)-'a']);
				
			}
		}
	

	
	
	
	
	
	
	
	//for (int i = 0; i < s.length(); i++) {
		
		//System.out.print(s.charAt(i));
		//System.out.println(a[s.charAt(i)-'a']);
		
	//	}
		//else
	//	{continue;
	//	}
		
		
		
	}
	/*for (int j = 0; j < a.length; j++) {
		System.out.println(a[j]);
	}*/
	
	
	
	
	
	
	
}
