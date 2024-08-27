package programsjavapractice;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(RemoveDuplicates.remDupSet("Hallo"));
	}
	
	public static String removeDuplicates(String inputStr) {
		
		StringBuilder s1 = new StringBuilder();
		for(char let:inputStr.toLowerCase().toCharArray()) {
			if (!s1.toString().contains(String.valueOf(let))) {
				s1.append(let);
			}
		}
		return s1.toString();
	}
	
	public static String remDupSet(String str) {
		
		Set<String> sc = new LinkedHashSet<String>();
		for (char letter: str.toLowerCase().toCharArray()) {
			sc.add(String.valueOf(letter));
		}
		
		StringBuilder s1 = new StringBuilder();
		for (String let:sc) {
			s1.append(let);
		}
		return s1.toString();
	}
}
