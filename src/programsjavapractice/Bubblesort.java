package programsjavapractice;
import java.util.Arrays;

public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bubblesort.bsort(new int[] {45,6,7,0,1,2});
		
	}
	public static void bsort(int[] arr) {
		int swapcounter = -1;
		int unsortlength = arr.length;
		while(swapcounter != 0) {
			swapcounter = 0;
			for (int i=0;i<unsortlength-1;i++) {
				if (arr[i] > arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					swapcounter++;
				}
			}
			unsortlength--;
		}
		System.out.println(Arrays.toString(arr));
	}

}
