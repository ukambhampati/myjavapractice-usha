package programsjavapractice;
public class StrConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Usha";
		String s2 = "rani";
		String s3 = s1.concat(s2);
		String s4 = s1+s2;
		String s5 = String.format("%s %d",s1,12);
		String s6 = String.join("|", s1,s2);
		System.out.println(s5);
	}

}
