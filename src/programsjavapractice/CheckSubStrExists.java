package programsjavapractice;
public class CheckSubStrExists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(CheckSubStrExists.substrexists("Usharani", "ran"));
	}
	
	public static boolean substrexists(String str, String sub) {
		if (str.contains(sub)) {
			return true;
		} else {
			return false;
		}
	}
}
