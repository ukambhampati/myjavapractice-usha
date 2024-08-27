package programsjavapractice;

import java.util.Arrays;

public class RemoveConsecutiveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aabbccddd";
		char[] arr = str.toCharArray();
		int len = arr.length;
		char ch = str.charAt(0);
		StringBuffer sb = new StringBuffer();
		sb.append(ch);
//		if (len < 1) {
//			System.out.println(str);
//		}
//		int j = 0;
//		for (int i=1; i<len ; i++) {
//			if (arr[j] != arr[i]) {
//				j++;
//				arr[j] = arr[i];
//				System.out.println(Arrays.toString(arr));
//			}
//		}
//		System.out.println(Arrays.copyOfRange(arr, 0, j + 1));
		for (int i=1;i<len;i++) {
			if (str.charAt(i) != ch) {
				sb.append(str.charAt(i));
				ch = str.charAt(i);
			}
		}
		System.out.println(sb.toString());
	}

}
