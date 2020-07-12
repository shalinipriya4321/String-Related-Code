import java.util.Scanner;

public class ExchangeName {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter 1st string");
	String s1=sc.nextLine();
	System.out.println("Enter 2st string");
	String s2=sc.nextLine();
	int index1=s1.indexOf('-');
	int index2=s2.indexOf('-');
	String emp1="";
	String emp2="";
	String emp3="";
	String emp4="";
	int i=0;
	while(s1.charAt(i)!='-') {
		emp1=emp1+s1.charAt(i);
		i++;
	}
	for(int j=index1;j<s1.length();j++) {
		emp2=emp2+s1.charAt(j);
	}
	int k=0;
	while(s2.charAt(k)!='-') {
		emp3=emp3+s2.charAt(k);
		k++;
	}
	for(int l=index2;l<s2.length();l++) {
		emp4=emp4+s2.charAt(l);
	}
	System.out.println(emp1+emp4);
	System.out.println(emp3+emp2);
		
	}
	
	
		
}
