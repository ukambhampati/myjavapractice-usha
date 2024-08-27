package programsjavapractice;
public class SecondMaxInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(SecondMaxInArray.secondmax(new int[] {12, 16, 99, 45, 67, 94}));
	}
	
	public static int secondmax(int[] arr) {
		
		// assume that first index is max
		int max = arr[0];
		int maxindex = 0;
		// assume that secondmax number in array is 0
		int secondmax = Integer.MIN_VALUE;
		// Find the max number from the array
		for(int i=0;i<arr.length;i++) {
			if (arr[i] > max) {
				max = arr[i];
				maxindex = i;
			}
		}
		// loop through the array and find find the max number other than the first max found in above loop
		for(int i=0;i<arr.length;i++) {
			if (i != maxindex && arr[i] > secondmax) {
				secondmax = arr[i];
			}
		}
		return secondmax;
	}

}
