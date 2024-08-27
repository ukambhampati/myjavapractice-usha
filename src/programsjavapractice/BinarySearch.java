package programsjavapractice;
import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = {6, 5, 2, 1, 9, 10, 0};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //  0  1  2  3  4  5  6
        // [0, 1, 2, 5, 6, 9, 10]
        System.out.println("index of 9: " + bsearch(arr, 9)); // index of 9: 5
        System.out.println("index of 1: " + bsearch(arr, 1)); // index of 1: 1
        System.out.println("index of 7: " + bsearch(arr, 13)); // index of 7: -1
	}
	
	public static int bsearch(int[] arr, int target) {
		
		int start = 0;
		int end = arr.length-1;
		int middle = (start+end) / 2;
		while (arr[middle] != target) {
			if (arr[middle] < target) {
				start = middle+1;
			}
			if (arr[middle] > target) {
				end = middle - 1;
			}
			if (start > end) {
				return -1;
			}
			middle = (start+end)/2;
		}
		return middle;
	}

}
