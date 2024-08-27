package programsjavapractice;

import java.util.Arrays;

public class MergeSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {6,7,8,9,10};	
		int[] mergedArray = new int[arr1.length+arr2.length];
		int k=0, i=0, j=0;
//		for (int i:a) {
//			c[k++] = i;
//		}
//		for (int j:b) {
//			c[k++] = j;
//		}
	    while (i < arr1.length && j < arr2.length) {
	        if (arr1[i] < arr2[j]) {
	            mergedArray[k++] = arr1[i++];
	        } else {
	            mergedArray[k++] = arr2[j++];
	        }
	    }
	    
	    while (i < arr1.length) {
	        mergedArray[k++] = arr1[i++];
	    }
	    while (j < arr2.length) {
	        mergedArray[k++] = arr2[j++];
	    }

		System.out.println(Arrays.toString(mergedArray));
	}

}
