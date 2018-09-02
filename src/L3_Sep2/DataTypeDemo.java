package L3_Sep2;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 02-Sep-2018
 */

public class DataTypeDemo {

	public static void main(String[] args) {

		byte by = 10;
		short sh = 10;
		int in = 10;
		long lo = 10;

		// case 1
		// by = sh ;
		// by = in ;
		// by = lo ;

		sh = by;
		// sh = in ;
		// sh = lo;

		in = by;
		in = sh;
		// in = lo

		lo = sh;
		lo = by;
		lo = in;

		// case 2
		by = 10;
		by = (byte) 516;
		System.out.println(by);

		by = (byte) 128;
		System.out.println(by);

		// case 3
		in = (int) 10000000000L;
		System.out.println(in);
		lo = 10000000000L;

		// case 4
		float fl = 4.5f;
		fl = (float) 6.7;

		// double db = fl;
		// fl = (float) db;

		// case 5
		in = (int) fl;
		System.out.println(in);

		fl = in;
		System.out.println(fl);

		// case 6
		boolean bl = true;

		if (in > 5) {

		}

		if (bl == true) {

		}

		if (bl) {

		}

		// case 7
		char ch = 98;
		System.out.println(ch);

		in = 'a';
		System.out.println(in);

		// ch = 65535;
		// System.out.println(Math.pow(2, 16));

		ch = (char) (ch + 1);
		System.out.println(ch);

		System.out.println((int) ch);
		System.out.println((char) 110);
		in = ch + 4;
		System.out.println(in);

		// case 8
		System.out.println(10 + 20 + "Hello" + 10 + 20);
		System.out.println(2 + ' ' + 5);
		System.out.println(2 + '\t' + 5);
		System.out.println(2 + " " + 5);
		System.out.println("Hello" + '\t' + "World");
		System.out.println("Hello" + "\t" + "World");

	}

}
