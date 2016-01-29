import java.math.BigInteger;

public class Test {
	public static void main(String[] args) {
		for(int i =0; i < 100000; i++){
			if(isPrime(i)){
				System.out.println(i);
			}
		}
	}

	public static boolean isPrime(BigInteger num) {
		
		if (num.equals(m("0")) || num.equals("1"))
			return false;
		if (num. < 4)
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
	private static BigInteger m(String num){
		return new BigInteger(num);
	}
}
