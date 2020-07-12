import java.util.Scanner;

public class CountNoCharEachWord {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=sc.nextLine();
		int count=0;
		String emp="";
		char ch[]=s1.toCharArray();
		for(int i=0;i<s1.length();i++) {
			if(ch[i]==' ') {
				emp=emp+count;
				count=0;		
			}
			else
			{
				count++;
				emp=emp+ch[i];
			}
		
		}
		emp=emp+count;
		
		System.out.println(emp);
		
		
		
		
	}

}
