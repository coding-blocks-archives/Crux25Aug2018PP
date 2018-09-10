package L6_Sep9;

import java.util.ArrayList;

/**
 * @author Garima Chhikara
 * @date Sep 9, 2018
 */

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		System.out.println(list);

		// add at last
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list);
		System.out.println(list.size());

		// get
		System.out.println(list.get(0));
		System.out.println(list.get(list.size() - 1));

		// set
		list.set(1, 60);
		System.out.println(list);

		// add at index
		list.add(2, 700);
		System.out.println(list);
		list.add(list.size(), 600);
		System.out.println(list);

		// remove
		list.remove(1);
		System.out.println(list);

		// print the list using for loop
		System.out.println("-- For Loop --");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// print list using enhanced for loop
		System.out.println("-- Enhanced Loop --");
		for (int val : list) {
			System.out.println(val);
		}

	}

}
