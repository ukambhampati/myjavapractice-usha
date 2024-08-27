package programsjavapractice;

import java.util.Arrays;

public class SeggregateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,1,0,0,1,1};
		
		int swapcount = -1;
		int len = arr.length -1;
		
		while (swapcount != 0) {
			swapcount = 0;
			for (int i=0; i<len; i++) {
				if (arr[i] == 0 && arr[i+1] != 0) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					swapcount++;
				}
			}
			len--;
		}
		System.out.println(Arrays.toString(arr));
	}

}
