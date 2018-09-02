package L3_Sep2;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 02-Sep-2018
 */

public class Temperature {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int minF = scn.nextInt();
		int maxF = scn.nextInt();
		int step = scn.nextInt();

		for (int temp = minF; temp <= maxF; temp += step) {

			int c = (int) ((5.0 / 9) * (temp - 32));

			System.out.println(temp + "\t" + c);
		}

		
	}

}
