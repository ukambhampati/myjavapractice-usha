package programsjavapractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ele = new ArrayList<String>();
		ele.add("usha");
		ele.add("rani");
		ele.add("kam");
		String[] names = ele.toArray(new String[0]);
		System.out.print(Arrays.toString(names));
	}

}
