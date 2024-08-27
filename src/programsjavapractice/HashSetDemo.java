package programsjavapractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		// Declaration
		HashSet<Object> mySet = new HashSet<Object>();
		Set<Object> myset1 = new HashSet<Object>();
		
		mySet.add("set1");
		mySet.add(12);
		mySet.add(12);
		mySet.add(null);
		mySet.add(null);
		System.out.println(mySet);
		System.out.println(mySet);
		// insertion order is not preserved
		
		mySet.remove(null);
		System.out.println(mySet);
		System.out.println(mySet.size());
		
		//inserting element is not possible in hashing technique
		// retrieving specific element - cannot extract specific element
		// Alternative way
		// Convert HashSet to ArrayList
		List list1 = new ArrayList<Object>(mySet);
		
		System.out.println(list1);
		System.out.println(list1.get(0));
		
		// Read all elements using looping statement
		// normal index for loop it is not possible
		// as indexing concept is not there
		// Set using hashing technique
		// using for each loop we can
		for (Object x:mySet) {
			System.out.println(x);
		}
		System.out.println(mySet.isEmpty());
		System.out.println(mySet.contains("set1"));
		
		Iterator<Object> it = mySet.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		mySet.clear();
		System.out.println(mySet);
		System.out.println(mySet.isEmpty());
		System.out.println(mySet.size());
	}

}
