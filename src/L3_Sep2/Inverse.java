package L3_Sep2;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 02-Sep-2018
 */

public class Inverse {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int pos = 1;
		int ans = 0;

		while (n != 0) {

			int rem = n % 10;
			ans = ans + pos * (int) Math.pow(10, rem - 1);

			// update
			pos++;
			n = n / 10;
		}

		System.out.println(ans);
	}

}
