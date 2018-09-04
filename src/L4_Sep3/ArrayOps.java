package L4_Sep3;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 03-Sep-2018
 */

public class ArrayOps {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		// int[] array = takeInput();
		int[] array = { 10, 20, 30, 50, 80 };
		display(array);

		System.out.println(max(array));
		System.out.println(linearSearch(array, 80));
		System.out.println(binarySearch(array, 80));
	}

	public static int[] takeInput() {

		System.out.println("Size ?");
		int n = scn.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		return arr;

	}

	public static void display(int[] arr) {

		System.out.println("-------------");
		for (int val : arr) {
			System.out.print(val + " ");
		}
		System.out.println();
		System.out.println("-------------");

	}

	public static int max(int[] arr) {

		int max = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) {
				max = arr[i];
			}
		}

		return max;

	}

	public static int linearSearch(int[] arr, int item) {

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == item) {
				return i;
			}

		}

		return -1;

	}

	public static int binarySearch(int[] arr, int item) {

		int lo = 0;
		int hi = arr.length - 1;

		while (lo <= hi) {

			int mid = (lo + hi) / 2;

			if (arr[mid] > item) { // lower half
				hi = mid - 1;
			} else if (arr[mid] < item) { // upper half
				lo = mid + 1;
			} else {
				return mid;
			}

		}

		return -1;

	}

}
