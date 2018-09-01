package L2_Sep1;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 01-Sep-2018
 */

public class BinaryToDecimal {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int binary = scn.nextInt();

		int ans = 0;
		int multiplier = 1; // 2 ki power 0

		while (binary != 0) {

			int rem = binary % 10;
			ans = ans + (rem * multiplier);

			// update
			binary = binary / 10;
			multiplier = multiplier * 2;
		}

		System.out.println(ans);
	}

}
