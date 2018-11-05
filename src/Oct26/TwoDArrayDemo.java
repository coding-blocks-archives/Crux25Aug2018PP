package Oct26;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 26-Oct-2018
 *
 */

public class TwoDArrayDemo {

	public static void main(String[] args) {

		int[][] arr = new int[3][5];

		System.out.println(arr);

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);

		// rows
		System.out.println(arr.length);

		// cols
		System.out.println(arr[0].length);

		System.out.println(arr[0][4]);

		// jagged array
		System.out.println(" -- JA -- ");
		int[][] jarr = new int[3][];

		System.out.println(jarr);

		System.out.println(jarr[0]);
		System.out.println(jarr[1]);
		System.out.println(jarr[2]);

		jarr[0] = new int[3];
		jarr[1] = new int[2];
		jarr[2] = new int[6];

		System.out.println(jarr[0]);
		System.out.println(jarr[1]);
		System.out.println(jarr[2]);

		// rows
		System.out.println(jarr.length);

		// cols
		System.out.println(jarr[0].length);
		System.out.println(jarr[1].length);

	}
}
