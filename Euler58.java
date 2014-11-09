import java.util.Date;

public class Euler58 {

	public static void main(String[] args) {
		Date start, end;
		start = new Date();

		int sideLength =3;
		double ratio = spiralPrimeDiagonals(sideLength);
		while ( ratio > 0.1d){
			sideLength +=2;	
			ratio = spiralPrimeDiagonals(sideLength);
			System.out.println(sideLength + " : " + ratio);
		}
		System.out.println(sideLength);
		end = new Date();
		System.out.println("Execution time: "
				+ (end.getTime() - start.getTime()));
	}
	private static double spiralPrimeDiagonals(int sideLength) {
		int diagonalLength = sideLength + sideLength -1;
		double primeCounter = 0d;
		
		int n = sideLength -1; 
		int m = 2;
		int l = 1;
		for (int i = 0; m <= n; i++) {
			if(isPrime(l)){
				primeCounter++;
			}
			m = (i % 4 == 0 && i != 0) ? m + 2 : m;
			l += m;
		}
		return primeCounter/(double)diagonalLength;

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
