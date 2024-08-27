package programsjavapractice;
import java.util.Arrays;

public class MaxnumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {12,34,567,23,45};
		System.out.println(MaxnumInArray.max(arr));
	}
	
	public static int maxinArray(int[] maxarr) {
		int length = maxarr.length;
		Arrays.sort(maxarr);
		return maxarr[length-2];
	}
	
	public static int max(int[] arr) {
		// Using assumption algorithm
		int max = arr[0];
		for(int num:arr) {
			if (num > max) {
				max = num;
			}
		}
		return max;
	}

}
