package programsjavapractice;
public class interviewe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 20, 10, 45, 20, 22, 44, 30, 44, 20, 22};
		int max = arr[0];
		for (int i=0;i<arr.length;i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		// missing values in array beween 0 to max
		for (int i=0;i<=max;i++) { //0
			for(int num: arr) {	//10, 20
				if (num ==i) {	
					break;
				}
				if (num < max && i!=num) { 
					System.out.println(i);
					break;
				}
			}
		}
		
	}

}
