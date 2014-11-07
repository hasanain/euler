

import java.util.Date;

/*
 *A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

 a2 + b2 = c2
 For example, 32 + 42 = 9 + 16 = 25 = 52.

 There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 Find the product abc.
 */
public class Euler9 {

	public static void main(String[] args) {

		int sum = 1000;
		int product = 0;
		Date start, end;

		start = new Date();

		for (int a = 0; a < sum / 3; a++) {
			for (int b = 0; b < sum / 2; b++) {
				int c = sum - (a + b);
				if ((c > 0) && (a * a + b * b == c * c)) {
					product = a * b * c;
				}
			}
		}
		end = new Date();
	
		System.out.println("The product = " + product);
		
		System.out.println("Execution time = "
				+ (end.getTime() - start.getTime()));
	}
}
