package programsjavapractice;

public class PeakElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,30,25,35};
		for (int i=1;i<arr.length-1;i++) {
			if (arr[i-1] < arr[i] && arr[i+1] < arr[i]) {
				System.out.println("peak element in an array"+arr[i]);
			}
		}

	}

}
// this might be O(n) time complexity as the number of times the loop executes will increase based on size of the array