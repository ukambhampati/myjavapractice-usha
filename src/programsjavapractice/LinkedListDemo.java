package programsjavapractice;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Object> l1 = new LinkedList<Object>();
		l1.add(10);
		l1.add("list1");
		l1.add("tihrd");
		l1.add(1, "inserted");
		l1.set(1, "updated");
		System.out.println(l1);
		l1.addFirst("first");
		l1.addLast("last");
		System.out.println(l1);
		System.out.println(l1.reversed());
		System.out.println(l1.getFirst()+","+l1.getLast());
		l1.removeFirst();
		l1.removeLast();
		System.out.println(l1);
		LinkedList<Integer> l2 = new LinkedList<Integer>();
		l2.add(100);
		l2.add(22);
		l2.add(11);
		l2.add(56);
		System.out.println(l2);
		Collections.sort(l2);
		Collections.sort(l2, Collections.reverseOrder());
		System.out.println(l2);
		System.out.println(l2.remove(1));
		System.out.println(l2);
		l2.set(2, 9);
		System.out.println(l2);
		System.out.println(l2.get(2));
		l2.reversed();
		System.out.println(l2);
	}

}
