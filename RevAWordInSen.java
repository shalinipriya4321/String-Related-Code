import java.util.Scanner;

public class RevAWordInSen {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string ");
		String s=sc.nextLine();
		String emp=" ";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				emp=emp+s.charAt(i);
			}
			else
			{
				reverse(emp);
				emp="";
			}
		
			
		}
		reverse(emp);
		
	
	}

	private static void reverse(String emp) {
		String rev="";
		for(int i=emp.length()-1;i>=0;i--) {
			rev=rev+emp.charAt(i);
		}
		System.out.print(rev+" ");
	}

}
