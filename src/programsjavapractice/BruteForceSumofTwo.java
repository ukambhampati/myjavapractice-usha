package programsjavapractice;
import java.util.Arrays;

public class BruteForceSumofTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(BruteForceSumofTwo.sumoftwo(new int[] {13, 43, 2, 71}, 84)));
		
	}
	
	public static int[] sumoftwo(int[] arr, int target) {
		int[] sumarr = new int[2];
		boolean found = false;
		for (int i=0;i<arr.length;i++) { 
			for (int j=0; j<arr.length;j++) {
				if (i != j) {
					if (arr[i]+arr[j] == target) {
						sumarr[0] = arr[i];
						sumarr[1] = arr[j];	
						found = true;
					}
				}
			}
			if (found) {
				break;
			}
		}
		return sumarr;
	}
}
