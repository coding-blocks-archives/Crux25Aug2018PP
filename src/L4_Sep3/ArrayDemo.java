package L4_Sep3;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 03-Sep-2018
 */

public class ArrayDemo {

	public static void main(String[] args) {

		int[] arr = null;
		arr = new int[5];

		System.out.println(arr.length);
		System.out.println(arr);

		// get
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		// System.out.println(arr[5]);

		// set
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		// get
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		// System.out.println(arr[5]);

		// for loop
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			// arr[i] = 100;
		}

		System.out.println("--- enhanced ---");
		// enhanced for loop
		// forward only, read only
		for (int val : arr) {
			System.out.println(val);
			val = 100;
			// System.out.println(val);
		}

		int i = 0, j = 2;

		// non working swap
		System.out.println(arr[i] + ", " + arr[j]);
		Swap(arr[i], arr[j]);
		System.out.println(arr[i] + ", " + arr[j]);

		// working swap
		System.out.println(arr[i] + ", " + arr[j]);
		Swap(arr, i, j);
		System.out.println(arr[i] + ", " + arr[j]);

		int[] other = { 100, 200, 300 };
		int[] array = { 10, 20, 30, 40, 50 };
		System.out.println(array[0] + ", " + other[0]);
		Swap(array, other);
		System.out.println(array[0] + ", " + other[0]);
	}

	public static void Swap(int[] one, int[] two) {
		int[] temp = one;
		one = two;
		two = temp;
	}

	public static void Swap(int[] array, int i, int j) {

		System.out.println(array[i] + ", " + array[j]);

		array = new int[6];

		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;

		System.out.println(array[i] + ", " + array[j]);
	}

	public static void Swap(int one, int two) {
		int temp = one;
		one = two;
		two = temp;
	}

}
