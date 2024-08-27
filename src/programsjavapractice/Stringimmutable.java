package programsjavapractice;
public class Stringimmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Usharani";
		System.out.println(s1);
		s1.concat("is good"); // creates a new string in string constant pool and the s1 values stays the same.
//		s1 = "updated";
		System.out.println(s1);

	}

}
