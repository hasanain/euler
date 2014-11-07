

import java.util.Date;

/*
 * A palindromic number reads the same both ways. The largest palindrome made from 
 * the product of two 2-digit numbers is 9009 = 91 ?? 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Euler4 {

	public static void main(String[] args) {

		int largestP = 0;
		Date start, end;
		
		start = new Date();
		
		for (int i = 100; i < 1000; i++) {
			
			for (int j = 100; j < 1000; j++) {
				
				if ((i * j) == numberReversed(i * j)) {

					if ((i * j) > largestP) {
						
						largestP = i * j;
					}
				}

			}
		}
		
		end = new Date();
		
		System.out.println("The Largest Palidrome = " + largestP);
		
		System.out.println("Execution time = "
				+ (end.getTime() - start.getTime()));

	}

	public static int numberReversed(int i) {
		int iReversed = 0;
		String str = "";
		while (i > 0) {
			str += String.valueOf(i % 10);

			i = i / 10;
		}
		iReversed = Integer.parseInt(str);
		return iReversed;
	}
}
