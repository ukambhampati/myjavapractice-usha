package programsjavapractice;
public class SecondMinInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(SecondMinInArray.secondmin(new int[] {12, 16, 99, 45, 67, 94}));
	}
	
	public static int secondmin(int[] numArr) {
		// assume that first index value is min
		int min = numArr[0];
		int minindex = 0;
		int secondmin = Integer.MAX_VALUE;
		// Find the max number from the array
		for(int i=0;i<numArr.length;i++) {
			if (numArr[i] < min) {
				min = numArr[i];
				minindex = i;
			}
		}
		// loop through the array and find find the max number other than the first max found in above loop
		for(int i=0;i<numArr.length;i++) {
			if (i != minindex && numArr[i] < secondmin) {
				secondmin = numArr[i];
			}
		}
		return secondmin;
				
	}

}
