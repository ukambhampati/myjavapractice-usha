package programsjavapractice;

import java.util.Arrays;

public class RearrangePosNeg {
	
	public static boolean isEven(int num) {
		if (num % 10 == 0) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
		int swapcounter = -1;
		int len = arr.length;

		for (int i=0;i<len;i++) {
			if (arr[i] < 0) {
				swapcounter++;
				int temp = arr[i];
				arr[i] = arr[swapcounter];
				arr[swapcounter] = temp;
				
			}
		}

		System.out.println(Arrays.toString(arr));
		int posstart = swapcounter+1;
		int negstart = 0;
	    while (posstart < len && negstart < posstart && arr[negstart] < 0) 
        { 
            int temp = arr[negstart]; 
            arr[negstart] = arr[posstart]; 
            arr[posstart] = temp; 
            posstart++; 
            negstart += 2; 
        } 
	    System.out.println(Arrays.toString(arr));
	}

}
