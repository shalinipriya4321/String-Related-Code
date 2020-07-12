import java.util.Scanner;

public class Palindrom {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=sc.next();
		String revS=reverseString(s1);
		if(s1.equals(revS)) {
			System.out.println("true");
		}
		else
			System.out.println("false");	
		
	}

	private static String reverseString(String s1) {
		String rev="";
		for(int i=s1.length()-1;i>=0;i--) {
			rev=rev+s1.charAt(i);
		}
		return rev;
		
		
	}
	

}
