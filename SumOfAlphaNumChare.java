import java.util.Scanner;

public class SumOfAlphaNumChare {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		int sum=0;
    char[] ch=s.toCharArray();
		
		for(int i=0;i<s.length();i++) {
			if(ch[i]>='0'&&ch[i]<='9') {
				sum=sum+(ch[i]-48);
			}
		}
		System.out.println(sum);
	}
}
