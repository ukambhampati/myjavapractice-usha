package programsjavapractice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaration 
		ArrayList<Object> mylist = new ArrayList<Object>();
		mylist.add("usha");
		mylist.add("usha");
		mylist.add(12.5);
		mylist.add("hello");
		mylist.add("a");
		mylist.add("hello");
		mylist.add(12.5);
		mylist.add(null);
		mylist.add(null);
		System.out.println(mylist);
	
		//size of arraylisy
		System.out.println(mylist.size());
		mylist.remove("hello");
		System.out.println(mylist);
		mylist.remove(1);
		System.out.println(mylist);
		// insert element in the middle some where in the arraylist
		mylist.add(0, "rani");
		System.out.println(mylist);
		mylist.add(4, "inserted");
		System.out.println(mylist);
		System.out.println(mylist.get(0));
		
		// modify/replace/change the values
		mylist.set(0, "kalyani");
		System.out.println(mylist);
		System.out.println(mylist.indexOf("usha"));
		// reading all elements in arraylist
		// using index
		for (int i=0; i<mylist.size(); i++) {
			System.out.println(mylist.get(i));
		}
		// for each
		for (Object i:mylist) {
			System.out.println(i);
		}
		// using iterator
		Iterator<Object> it=mylist.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		// Checking if array list empty
		
		System.out.println(mylist.isEmpty());	
		ArrayList<Object> list2 = new ArrayList<Object>();
		list2.add("usha");
		list2.add("kalyani");
		list2.add("hello");
		System.out.println(list2);
		System.out.println(mylist.contains("usha"));
		mylist.removeAll(list2);
		System.out.println(mylist.contains("usha"));
		System.out.println(mylist);
		System.out.println(mylist.contains(list2));
		mylist.clear();
		System.out.println(mylist);
		

	}

}
