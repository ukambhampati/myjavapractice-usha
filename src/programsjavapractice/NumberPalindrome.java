package programsjavapractice;
public class NumberPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(NumberPalindrome.isNumPal(123));

	}
	
	public static boolean isNumPal(int num) {
		int actualNum = num;
		int reverse = 0;
		while (num != 0) {
			int last = num%10; // modulous will return reminder so in this case 454%10=4
			reverse = reverse*10+last;	// 0*10+4=4 |4*10+5=45| 45*10+4=454 
			num = num/10; // num divided by 2 will give the quotient so in this case it will give 45 			
		}
		return (actualNum == reverse);
	}
}
