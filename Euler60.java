import java.util.Date;


public class Euler60 {
	public static void main(String [] args){
		Date start, end;
		start = new Date();
		int [] primes = new int[4];
		
		end = new Date();
		System.out.println("Execution time: " + (end.getTime()- start.getTime()));
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

