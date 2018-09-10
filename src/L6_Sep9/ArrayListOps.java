package L6_Sep9;

import java.util.ArrayList;

/**
 * @author Garima Chhikara
 * @date Sep 9, 2018
 */

public class ArrayListOps {

	public static void main(String[] args) {

		// int[] one = { 10, 10, 10, 30, 40, 50, 60, 60 };
		// int[] two = { 10, 10, 60, 60, 60, 70, 80 };
		//
		// System.out.println(intersection(one, two));
		// System.out.println(intersectionTwoLoops(one, two));

		// int[] one = { 9, 9 };
		// int[] two = { 9, 9, 5, 4 };
		//
		// System.out.println(addition(one, two));

		int[] arr = { 8, 85, 89, 889, 897, 899, 859 };

		largestNum(arr);

		for (int val : arr) {
			System.out.print(val);
		}

	}

	public static ArrayList<Integer> intersection(int[] one, int[] two) {

		ArrayList<Integer> ans = new ArrayList<>();

		int i = 0;
		int j = 0;

		while (i < one.length && j < two.length) {

			if (one[i] < two[j]) {
				i++;
			} else if (one[i] > two[j]) {
				j++;
			} else {
				ans.add(one[i]);
				i++;
				j++;
			}
		}

		return ans;
	}

	public static ArrayList<Integer> intersectionTwoLoops(int[] one, int[] two) {

		ArrayList<Integer> ans = new ArrayList<>();

		for (int i = 0; i < one.length; i++) {

			for (int j = 0; j < two.length; j++) {

				if (one[i] == two[j]) {
					ans.add(one[i]);
					two[j] = Integer.MAX_VALUE;
					break;
				}
			}
		}

		return ans;

	}

	public static ArrayList<Integer> addition(int[] one, int[] two) {

		ArrayList<Integer> ans = new ArrayList<>();

		int i = one.length - 1;
		int j = two.length - 1;
		int carry = 0;

		while (i >= 0 || j >= 0) {

			int sum = carry;

			if (i >= 0) {
				sum += one[i];
			}

			if (j >= 0) {
				sum += two[j];
			}

			int rem = sum % 10;
			carry = sum / 10;
			ans.add(0, rem);

			i--;
			j--;

		}

		if (carry != 0) {
			ans.add(0, carry);
		}

		return ans;
	}

	public static void largestNum(int[] arr) {

		for (int counter = 0; counter < arr.length - 1; counter++) {

			for (int j = 0; j < arr.length - counter - 1; j++) {

				if (compare(arr[j], arr[j + 1]) > 0) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}

		}

	}

	// swap -> 1, not swap -> -1
	public static int compare(int n1, int n2) {

		String val1 = n1 + "" + n2;
		String val2 = n2 + "" + n1;

		int val1int = Integer.valueOf(val1);
		int val2int = Integer.valueOf(val2);

		if (val1int > val2int) {
			return -1;
		} else {
			return 1;
		}

	}

}
