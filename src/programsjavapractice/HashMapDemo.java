package programsjavapractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;



public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Object, Object> myMap = new HashMap<Object, Object>();
		myMap.put(0, "Zero");
		myMap.put(1, "One");
		myMap.put(2, "Two");
		myMap.put(3, "Three");
		myMap.put(3, "Four");
		myMap.put(null, null);
		myMap.put(null, null);
		myMap.put(4, null);
		System.out.println(myMap);
		String num = "23";
		StringBuffer sb = new StringBuffer();
		int num1 = Integer.valueOf(String.valueOf(num.charAt(0)));
		int num2 = Integer.valueOf(String.valueOf(num.charAt(1)));
		sb.append(myMap.get(num1));
		sb.append(myMap.get(num2));
		System.out.println(sb.toString());
		myMap.remove(3);
		System.out.println(myMap);
		System.out.println(myMap.keySet());
		System.out.println(myMap.values());
		
		System.out.println(myMap.entrySet());
		
		// reading data from hashmap
		for (Object key:myMap.keySet()) {
			System.out.println(myMap.get(key));
		}
		
		// Using Iterator
		Iterator<Object> it = myMap.keySet().iterator();
		while (it.hasNext()) {
			System.out.println(myMap.get(it.next()));
		}
		
		Iterator<Entry<Object, Object>> it1 = myMap.entrySet().iterator();
		while (it1.hasNext()) {
			Entry<Object, Object> entry = it1.next();
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
		myMap.clear();
		System.out.println(myMap.isEmpty());
	}

}
