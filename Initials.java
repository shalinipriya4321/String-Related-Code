import java.util.Scanner;

public class Initials {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string");
	String s=sc.nextLine();
	System.out.println("Enter age of student");
	int age=sc.nextInt();
	String emp="";
	
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)==' ') {
			emp=emp+s.charAt(0)+s.charAt(i+1);
		}
	}
	System.out.println(emp+age);
}
}
