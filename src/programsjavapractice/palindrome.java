package programsjavapractice;
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(palindrome.isP("aaa"));

	}
	
	public static boolean isPalindrome(String str) {
		
		int length = str.length()-1;
		StringBuffer sb = new StringBuffer();
		for (int i=length; i>=0; i--) {
			sb.append(str.charAt(i));
		}
		if (sb.toString().toLowerCase().equals(str.toLowerCase())) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isPal(String str) {

		char[] char1 = str.toCharArray();
		int start = 0;
		int end = char1.length-1;
		boolean pal = false;
		while (start < end) {
			if (char1[start] == char1[end]) {
				pal = true;
			} else {
				pal = false;
			}
			start ++;
			end--;
		}
		return pal;
	}
	
	public static boolean isP(String str) {
		int end = str.length()-1;
		int start = 0;
		while (start < end) {
			if (str.charAt(start) == str.charAt(end)) {
				start++;
				end--;
			}
			else {
				return false;
			}
		}
		return true;
	}

}
