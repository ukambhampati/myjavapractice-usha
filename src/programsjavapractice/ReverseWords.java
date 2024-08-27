package programsjavapractice;
public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ReverseWords.revWords("Hi I am Usha"));
	}
	
	public static String revWords(String inputstr) {
		String[] words = inputstr.split(" ");
		StringBuilder sb = new StringBuilder();
		for(int i=words.length-1;i>=0;i--) {
			sb.append(words[i]).append(" ");
		}
		return sb.toString().trim();
	}

}
