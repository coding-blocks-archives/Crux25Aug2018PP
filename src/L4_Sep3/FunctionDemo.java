package L4_Sep3;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 03-Sep-2018
 */

public class FunctionDemo {

	static int val = 100;

	public static void main(String[] args) {

		System.out.println("---------- Case 1 -----------");

		System.out.println("hello");

		// function call
		addition();

		System.out.println("bye");

		subtraction();

		System.out.println("---------- Case 2 -----------");

		int num1 = 3;
		int num2 = 6;
		additionParams(num1, num2);

		System.out.println("---------- Case 3 -----------");

		System.out.println(additionParamsReturn(10, 20));
		// System.out.println(val);

		System.out.println("---------- Case 4 -----------");

		System.out.println(val);
		int val = 200;
		System.out.println(val);
		System.out.println(FunctionDemo.val);

		additionParams(val, FunctionDemo.val);
		System.out.println(val);
		System.out.println(FunctionDemo.val);

		System.out.println("----------- Case 5 -----------");
		
		int one = 10, two = 20;
		System.out.println(one + ", " + two);
		Swap(one, two);
		System.out.println(one + ", " + two);

	}

	public static void Swap(int one, int another) {
		System.out.println(one + ", " + another);

		int temp = one;
		one = another;
		another = temp;

		System.out.println(one + ", " + another);
	}

	public static int additionParamsReturn(int a, int b) {

		int sum = a + b;
		return sum;
	}

	public static void additionParams(int a, int b) {

		int val = 1000;
		FunctionDemo.val = 30;
		b = FunctionDemo.val;
		int sum = val + b;
		System.out.println(sum);

	}

	// definition
	public static void addition() {

		int a = 2;
		int b = 3;
		int sum = a + b;

		subtraction();
		System.out.println(sum);
	}

	public static void subtraction() {

		int a = 8;
		int b = 2;
		int sub = a - b;
		System.out.println(sub);
	}

}
