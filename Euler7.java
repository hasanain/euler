

import java.util.Date;

public class Euler7 {

	public static void main(String[] args) {

		int counter = 0;
		long primeCandidate = 0;
		Date start, end;
		long prime=0;
		start = new Date();

		while (counter < 10001) {
			
			if (isPrime(primeCandidate)) {
				if(counter == 10000){
					prime = primeCandidate;
					break;
				}
				counter++;
			}

			primeCandidate++;
		}
		
		end = new Date();
		
		System.out.println(prime);
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
