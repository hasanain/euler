

import java.util.Date;

public class Euler10 {
	public static void main(String[] args) {

		long prime = 3;
		long primeSum = 2;
		Date start, end;

		start = new Date();

		while (prime < 2000000) {

			if (isPrime(prime)) {

				primeSum += prime;
			}
			prime += 2;
		}

		end = new Date();

		System.out.println(primeSum);

		System.out.println("Execution time = "
				+ (end.getTime() - start.getTime()));
	}

	public static boolean isPrime(long num) {

		if (num == 0 || num == 1)
			return false;
		if (num < 4)
			return true;
		if (num % 2 == 0)
			return false;
		if (num < 9)
			return true;
		if (num % 3 == 0)
			return false;
		else {

			int sqrt = (int) Math.floor(Math.sqrt(num));
			int f = 5;

			while (f <= sqrt) {
				if (num % f == 0)
					return false;
				if (num % (f + 2) == 0)
					return false;
				f += 6;
			}
			return true;
		}
	}
}
