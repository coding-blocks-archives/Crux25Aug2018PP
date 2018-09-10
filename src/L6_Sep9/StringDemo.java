package L6_Sep9;

/**
 * @author Garima Chhikara
 * @date Sep 9, 2018
 */

public class StringDemo {

	public static void main(String[] args) {

		String str = "hello";
		System.out.println(str);

		// length
		System.out.println(str.length());

		// charAt
		char ch = str.charAt(2);
		System.out.println(ch);
		System.out.println(str.charAt(str.length() - 1));

		// substring
		String ss = str.substring(2, 4);
		System.out.println(ss);
		System.out.println(str.substring(1, 4)); // ell
		System.out.println(str.substring(0, 5)); // hello
		// System.out.println(str.substring(0, 6)); // error
		System.out.println(str.substring(2, 2)); // blank
		// System.out.println(str.substring(3, 2));

		System.out.println(str.substring(1)); // ello
		System.out.println(str.substring(3)); // lo

		// concatenate two strings
		String s1 = "hi";
		String s2 = "bye";
		String s3 = s1 + s2;
		System.out.println(s1 + ", " + s2 + ", " + s3);
		String s4 = s1.concat(s2);
		System.out.println(s1 + ", " + s2 + ", " + s4);

		// indexOf
		System.out.println(str.indexOf("el"));
		System.out.println(str.indexOf("eL"));

		// startsWith
		System.out.println(str.startsWith("He"));
		System.out.println(str.startsWith("he"));

		// equals and ==
		s1 = "Hello";
		s2 = s1;
		s3 = "Hello";
		s4 = new String("Hello");

		System.out.println((s1 == s2) + ", " + s1.equals(s2)); // true true
		System.out.println((s1 == s3) + ", " + s1.equals(s3)); // true true
		System.out.println((s1 == s4) + ", " + s1.equals(s4)); // false true

		String s11 = "hallo";
		System.out.println(s11);
		
		str = "heeeelo";
		String s10 = str.replace("eee", "a");
		System.out.println(s10);

	}

}
