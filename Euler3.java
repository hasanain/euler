

import java.util.Date;

/*
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143?
 */
public class Euler3 {

	public static void main(String[] args) {

		double number = 600851475143d;
		long largestPrime = 0;
		Date startTime, endTime;

		startTime = new Date();

		for (int i = 3; i < (int) Math.sqrt(number) + 1; i+= 2) {

			if (number % i == 0) {

				if (isPrime(i) && i > largestPrime) {
					largestPrime = i;
				}

			}
		}

		endTime = new Date();

		System.out.println(largestPrime);
		System.out.println("Execution time = "
				+ (endTime.getTime() - startTime.getTime()));
	}

	public static boolean isPrime(long num) {

		double sqrt = Math.sqrt(num);
		int sqrtCeil = (int) Math.ceil(sqrt) + 1;

		if (num == 0 || num == 1)
			return false;
		if (num == 2)
			return true;
		if (num % 2 == 0)
			return false;
		for (int i = 3; i < sqrtCeil; i += 2) {

			if ((num % i) == 0)
				return false;
		}
		return true;
	}
}
