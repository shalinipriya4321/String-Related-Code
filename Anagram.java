import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st string");
		String s1=sc.next();
		System.out.println("Enter 2st string");
		String s2=sc.next();
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		char[] ss1=s1.toCharArray();
		char ss2[]=s2.toCharArray();

		Arrays.sort(ss1);
		Arrays.sort(ss2);
		if(ss1.length!=ss2.length) 
			System.out.println("false");
		else
		{
		
for(int i=0;i<ss1.length;i++) {
	if(ss1[i]==ss2[i]) {
		System.out.println("true");
		break;
	}
	System.out.println("false");
	break;
}
		}

		



		
	}
}
