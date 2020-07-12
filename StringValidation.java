import java.util.Scanner;

public class StringValidation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.next();
		if(s.length()!=10) {
			System.out.println("invalid Input");
		}
		
		
	}

}
