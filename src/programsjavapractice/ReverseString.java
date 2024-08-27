package programsjavapractice;
import java.util.Scanner;

public class ReverseString {
	
	public String reverse(String str) {
		int length = str.length();
		StringBuilder sb = new StringBuilder();
		for (int i=length-1; i>=0; i--) {
			sb.append(str.charAt(i));
		}
		
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the string to reverese");
		String inputStr = s1.nextLine();
		System.out.println("Provided input string is: "+inputStr);
		ReverseString rs = new ReverseString();
		System.out.println("Reverse of "+inputStr+" is:"+rs.reverse(inputStr));
		s1.close();

	}

}
