package programsjavapractice;

import java.util.Arrays;

public class RotateNyOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// here rotate by 2 is implemented 
		int rotate = 3;
		int[] arr = {1,2,3,4,5,6};
		
		int n = arr.length-1;
		int p = 1;

		while (p <= rotate) {
			int last = arr[0];
			for (int i=0; i<n; i++) {
				arr[i] = arr[i+1];
			}
			arr[n] = last;
			p++;
		}
		System.out.println(Arrays.toString(arr));
	}

}
