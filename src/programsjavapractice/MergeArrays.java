package programsjavapractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr1 = {1,2,3};
		Integer[] arr2 = Arrays.copyOf(arr1, arr1.length-1);
		System.out.println(Arrays.toString(arr2));
		Integer[] arr3 = Arrays.copyOfRange(arr1, 0, 1);
		System.out.println(Arrays.toString(arr3));
		
		List<Integer> a1 = new ArrayList<Integer>(Arrays.asList(arr1));
		a1.addAll(Arrays.asList(arr2));
		System.out.println(a1);
	}

}
