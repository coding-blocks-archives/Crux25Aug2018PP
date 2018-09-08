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
		int[] array = { 1000, 200, 150, 130, 120, 100 };
		display(array);

		System.out.println(max(array));
		System.out.println(linearSearch(array, 80));
		System.out.println(binarySearch(array, 80));

		int[] res = rotate(array, -9);
		display(res);

		// bubbleSort(array);
		// selectionSort(array);
		insertionSort(array);
		display(array);
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

	public static void reverse(int[] arr) {

		int left = 0;
		int right = arr.length - 1;

		while (left < right) {
			// swap
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;

			left++;
			right--;
		}
	}

	public static int[] rotate(int[] arr, int r) {

		r = r % arr.length;

		if (r < 0) {
			r = r + arr.length;
		}

		int[] ans = new int[arr.length];

		for (int i = 0; i < ans.length; i++) {

			if (i < r) {
				ans[i] = arr[i + arr.length - r];
			} else {
				ans[i] = arr[i - r];
			}
		}

		return ans;

	}

	public static int[] inverse(int[] arr) {

		int[] ans = new int[arr.length];

		for (int i = 0; i < ans.length; i++) {
			ans[arr[i]] = i;
		}

		return ans;

	}

	public static void bubbleSort(int[] arr) {

		for (int counter = 0; counter < arr.length - 1; counter++) {

			for (int j = 0; j < arr.length - counter - 1; j++) {

				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}

		}

	}

	public static void selectionSort(int[] arr) {

		for (int counter = 0; counter < arr.length - 1; counter++) {

			int min = counter;

			for (int j = counter + 1; j <= arr.length - 1; j++) {

				if (arr[j] < arr[min]) {
					min = j;
				}
			}

			// swap
			int temp = arr[min];
			arr[min] = arr[counter];
			arr[counter] = temp;
		}

	}

	public static void insertionSort(int[] arr) {

		for (int counter = 1; counter < arr.length; counter++) {

			int temp = arr[counter];

			int j = counter - 1;

			while (j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j--;
			}

			arr[j + 1] = temp;
		}

	}

}
