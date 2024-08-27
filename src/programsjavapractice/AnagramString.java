package programsjavapractice;
import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(AnagramString.isAanagram("ab", "cba"));
	}

//	public static boolean isAanagram(String str1, String str2) {
//		char[] char1 = str1.toLowerCase().toCharArray();
//		char[] char2 = str2.toLowerCase().toCharArray();
//		boolean flag = false;
//		for (int i=0;i<char1.length;i++) {
//			flag = false;
//			for (int j=0; j<char2.length;j++) {		
//				if (char2[j] == char1[i]) {
//					flag = true;
//				}
//			}
//			if (flag == false) {
//				break;
//			}
//		}
//		return flag;
//	}
	
	public static boolean isAanagram(String str1, String str2) {
		char[] char1 = str1.toLowerCase().toCharArray();
		char[] char2 = str2.toLowerCase().toCharArray();
		Arrays.sort(char1);
		Arrays.sort(char2);
		return Arrays.equals(char1, char2);
	}
}
