package programsjavapractice;

public class FindMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int[] array = {1,2,3,5};
	    int sum = n * (n + 1) / 2;
	    for (int num : array) {
	        sum -= num;
	    }
	    System.out.println(sum);
	}

}
