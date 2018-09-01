package L2_Sep1;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 01-Sep-2018
 */

public class DecimalToBinary {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int ans = 0;
		int multiplier = 1; // 10 ki power 0
		int decimal = scn.nextInt();

		while (decimal != 0) {

			int rem = decimal % 2;
			ans = ans + (rem * multiplier);

			// update
			decimal = decimal / 2;
			multiplier = multiplier * 10;
		}

		System.out.println(ans);
	}

}
