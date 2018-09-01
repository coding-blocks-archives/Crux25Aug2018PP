package L2_Sep1;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 01-Sep-2018
 */

public class Pattern27 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int val = 1;
		int nst = 1;
		int nsp = n - 1;
		int row = 1;

		while (row <= n) {

			val = 1;
			// work
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}

			int cst = 1;
			while (cst <= nst) {

				System.out.print(val);

				if (cst <= nst / 2)
					val++;
				else
					val--;

				cst++;
			}

			// prep
			row = row + 1;
			nst = nst + 2;
			nsp = nsp - 1;
			System.out.println();

		}

	}

}
