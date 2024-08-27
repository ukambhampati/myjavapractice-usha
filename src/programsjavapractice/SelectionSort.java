package programsjavapractice;
import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SelectionSort.ssort(new int[] {1,6,92,65,33,0,3,2});
	}
	
	public static void ssort(int[] arr) {
		
		for (int i=0; i< arr.length; i++) {
			int min = arr[i];
			int minindex = i;
			
			for (int j= i+1; j < arr.length;j++) {
				if (arr[j] < min) {
					min= arr[j];
					minindex = j;
				}
			}
			int temp = arr[i];
			arr[i] = min;
			arr[minindex] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
