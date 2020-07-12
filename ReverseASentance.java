import java.util.Scanner;

public class ReverseASentance {
	static String emp="";
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		String rev="";
		
  /*	String sArr[]=s.split(" ")		;
		
		for(int i=sArr.length-1;i>=0;i--) {
			rev=rev+sArr[i]+" ";
		}
		System.out.println(rev);*/
		//reverse a sentence without split function
	for(int i=s.length()-1;i>=0;i--) {
		rev=rev+s.charAt(i);
	}
	//System.out.println(rev);
		for (int i = 0; i < rev.length(); i++) {
			if(rev.charAt(i)!=' ') {
				emp=emp+rev.charAt(i);
			}
			else
			{
				reverseWord(emp);
				emp="";
			}
				
		}
		reverseWord(rev);
		
	}

	private static void reverseWord(String emp) {
		String r="";
		for(int j=emp.length()-1;j>=0;j--) {
			r=r+emp.charAt(j);
		}
			System.out.print(r+" ");
		
		
	}
	

}
