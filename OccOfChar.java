import java.util.Scanner;

public class OccOfChar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		int count=0;
		int[] ch=new int[26];
		String emp="";
		int n=s.length();
		char ch1[]=s.toCharArray();
		
		for(int i=0;i<s.length();i++) {
		for(int j=i+1;j<s.length();j++)	{
			if(ch1[i]==ch1[j]) {
				count++;	
			}
			int k=j;
			while(k<n-1) {
				k++;
			}
			n--;
			j--;
			
				
			}
	
		}
System.out.println(count);
}
}