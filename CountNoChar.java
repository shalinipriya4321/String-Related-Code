import java.util.Scanner;

public class CountNoChar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=sc.next();
		int count=0;
		char[] ch=s1.toCharArray();
		
		for(int i=0;i<s1.length();i++) {
			if(ch[i]>=65&&ch[i]<=90||ch[i]>=97&&ch[i]<=122||ch[i]>=48&&ch[i]<=57&&ch[i]!=32&&ch[i]!=','&&ch[i]!='.')
				count++;
		}
		System.out.println(count);
	}	

}
