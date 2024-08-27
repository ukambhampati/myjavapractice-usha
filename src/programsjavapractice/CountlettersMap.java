package programsjavapractice;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountlettersMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(CountlettersMap.countletters("aaaa"));
	}
	
	public static Map<Character,Integer> countletters(String str) {
		Map<Character, Integer> letters = new LinkedHashMap<>();
		for (char ch:str.toCharArray()) {
			if (letters.containsKey(ch)) {
				int count = letters.get(ch)+1;
				letters.replace(ch, count);
			} else {
				letters.put(ch, 1);
			}
		}
		return letters;
	}

}
