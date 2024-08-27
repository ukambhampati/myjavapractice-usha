package programsjavapractice;
import java.util.Stack;

public class BalancedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(isBalanced("[{()}]")); // true
        System.out.println(isBalanced("[({(})]")); // false
        System.out.println(isBalanced("{[}")); // false
        System.out.println(isBalanced("({}{}([{}]))")); // true
        System.out.println(isBalanced("({")); // false
	}
	
    public static boolean isBalanced(String str) {
        // TODO your code goes here
    	Stack<Character> st = new Stack<>();
    	for(char ch: str.toCharArray()) {
    		if (ch == '{' || ch == '[' || ch == '(') {
    			st.push(ch);
    		} else {
    			char open = st.pop();
    			if (ch != '}' && open == '{') {
    				return false;
    			} else if (ch != ']' && open == '[') {
    				return false;
    			} else if (ch != ')' && open == '(') {
    				return false;
    			} else {
    				continue;
    			}
    		}
    	}
        return st.isEmpty();
    }

}
