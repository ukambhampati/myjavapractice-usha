package programsjavapractice;
import java.util.Arrays;

public class MinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(MinArray.min(new int[] {11,67,2,3,34}));
	}
	public static int mininArray(int[] maxarr) {
		Arrays.sort(maxarr);
		return maxarr[0];
	}
	
	public static int min(int[] arr) {
		// Using assumption algorithm
		int min = arr[0];
		for(int num:arr) {
			if (num < min) {
				min = num;
			}
		}
		return min;
	}
}
