import java.math.BigInteger;

public class Euler15 {

	public static void main(String[] args) {
		
		System.out.println("There are " + factorial(40).divide(
				factorial(20).multiply(factorial(20))) + " routes");
	}

	public static BigInteger factorial(int n) {
		BigInteger fact = new BigInteger("1");
		for (int i = 1; i <= n; i++) {
			fact = fact.multiply(new BigInteger(Integer.toString(i)));
		}
		return fact;
	}

}
