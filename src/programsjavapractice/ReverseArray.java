package programsjavapractice;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] inarr = {3,12,8,9,10,3,4};
		ReverseArray.revArray(inarr);
		System.out.println(Arrays.toString(inarr));

	}

/*This approach needs one more array and a counter from start*/
//	public static int[] revArray(int[] inputArr) {
//		int length = inputArr.length;
//		int[] revAr = new int[length];
//		int count = 0;
//		for(int i=length-1; i>=0; i--) {
//			revAr[count] = inputArr[i];
//			count++;
//		}
//		return revAr;
//	}

	public static void revArray(int[] inputArr) {
		int start = 0;
		int end = inputArr.length-1;
		while (start < end) {
			int temp = inputArr[start];
			inputArr[start] = inputArr[end];
			inputArr[end] = temp;
			start++;
			end--;
		}
	}
	
}
