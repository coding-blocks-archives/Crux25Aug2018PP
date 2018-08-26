import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 25-Aug-2018
 */

public class Prime {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int div = 2;

		int a = 0;

		while (div <= n - 1) {

			if (n % div == 0) {
				a = 1;
			}

			div = div + 1;
		}

		if (a == 1) {
			System.out.println("Not Prime");
		} else {
			System.out.println("Prime");
		}

	}
}
