import java.util.Scanner;

public class Panagrame {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		
		String st=removeSpace(s);
		System.out.println(st);
		int d=cheak(st);
		if(d==-1) {
			System.out.println("not a panagrame");
		}
		else
		{
			System.out.println("Panagarame");
		}	
	}

	private static int cheak(String st) {
		int n=26;
		if(st.length()<n)
		return -1;
		for(int i='A';i<='Z';i++) {
		if((st.indexOf(i)<0)&&(st.indexOf((char)(i+32))<0))	
			
			return -1;
		}
		return 1;
			
	}

	private static String removeSpace(String s) {
	
	String emp="";
	char ch[]=s.toCharArray();
	for (int i = 0; i < s.length(); i++) {
		if(ch[i]!=' ') 
			emp=emp+ch[i];
	}
	return emp;
	
		
	}

}
