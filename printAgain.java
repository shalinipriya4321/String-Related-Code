import java.util.Scanner;

public class printAgain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string ");
		String s=sc.nextLine();
		String emp="";
		for (int i = 0; i < s.length(); i++) {
			emp=emp+s.charAt(i)+s.charAt(i);
			
		}
		System.out.println(emp);
		
		
		
	}
	

}
