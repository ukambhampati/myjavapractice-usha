package programsjavapractice;
public class CountOccurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(CountOccurences.count_occurences("Usharani is a good girl", "i"));
	}
	
	public static int count_occurences(String str, String sub) {
		
		int count = 0;
		int index = 0;
		
		while ((index = str.indexOf(sub, index)) != -1) {
			count++;
			index += sub.length();
		}
		return count;
	}

}
