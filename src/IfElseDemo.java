
/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 25-Aug-2018
 */

public class IfElseDemo {

	public static void main(String[] args) {

		int marks = 5;
		int pack = 5;

		if (marks > 80 || pack > 20) {
			System.out.println("very intelligent");
		} else if (marks > 50 && pack == 10) {
			System.out.println("very good");
		} else if (marks > 30 || pack < 6) {
			System.out.println("good");
		}
		

		if (marks > 50 && pack == 10) {
			System.out.println("very good");
		}
		
		System.out.println("bye");
	}

}
