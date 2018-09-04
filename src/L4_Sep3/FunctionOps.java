package L4_Sep3;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 03-Sep-2018
 */

public class FunctionOps {

	public static void main(String[] args) {

		printAllArmstrong(0, 1000);
	}

	public static void printAllArmstrong(int ll, int ul) {

		for (int n = ll; n <= ul; n++) {
			int digits = numberOfDigits(n);
			if (isArmstrong(n, digits) == true) {
				System.out.println(n);
			}
		}
	}

	public static boolean isArmstrong(int num, int nod) {

		int onum = num;
		int ans = 0;

		while (num != 0) {
			int rem = num % 10;
			ans = ans + (int) Math.pow(rem, nod);
			num = num / 10;
		}

		if (onum == ans) {
			return true;
		} else {
			return false;
		}

	}

	public static int numberOfDigits(int num) {

		int count = 0;

		while (num != 0) {
			count++;
			num = num / 10;

		}

		return count;

	}

}
