import java.util.Scanner;

public class Anagram2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st string");
		String s1=sc.next();
		System.out.println("Enter 2st string");
		String s2=sc.next();
		
		if(s1.length()==s2.length())
		{
	 s1=ChangeLowerCase1(s1);
	 s2=ChangeLowerCase2(s2);
	 char ch1[]=s1.toCharArray();
	 char ch2[]=s2.toCharArray();
	 
	char[] c1=sort(ch1);
	char[] c2=sort2(ch2);
	//System.out.print(c1);
	//System.out.print(c2);
	boolean b=compareCharArray(c1,c2);
	System.out.println(b);
		}
		else
		{
			System.out.println("false");
		}
		
			
	
		
		}

	private static boolean compareCharArray(char[] c1, char[] c2) {
		for(int i=0;i<c1.length;i++) {
			for(int j=0;j<c2.length;j++) {
				if(c1[i]==c2[j]) {
					return true;
					
				}
			}
		}
		return false;
	}

	private static char[] sort2(char[] ch2) {
		char temp;
		for(int i=0;i<ch2.length;i++) {
			for(int j=i+1;j<ch2.length;j++) {
				if(ch2[i]>ch2[j]) {
					temp=ch2[i];
					ch2[i]=ch2[j];
					ch2[j]=temp;
							
				}
			}
		}
		
		return ch2;
		
		
	}

	private static char[] sort(char[] ch1) {
	
		char temp;
		for(int i=0;i<ch1.length;i++) {
			for(int j=i+1;j<ch1.length;j++) {
				if(ch1[i]>ch1[j]) {
					temp=ch1[i];
					ch1[i]=ch1[j];
					ch1[j]=temp;
							
				}
			}
		}
		
		return ch1;
		
	}



	private static String ChangeLowerCase2(String s2) {
	String result="";
		for(int i=0;i<s2.length();i++) {
			char ch=s2.charAt(i);
		if(ch>='A'&&ch<='Z') 
			result=result+(char) (ch+32);
		
		else
			result=result+ch;
			
	}
		return result;
		
		
	}

	private static String ChangeLowerCase1(String s1) {
		String emp="";
		for(int i=0;i<s1.length();i++) {
		if(s1.charAt(i)>='A'&&s1.charAt(i)<='Z') 
			emp=emp+(char)(s1.charAt(i)+32);
		
		else
			emp=emp+s1.charAt(i);
			
	}
		return emp;
	
	}
		

		
		
	

}
