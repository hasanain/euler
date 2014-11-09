import java.math.BigInteger;
import java.util.Date;

public class Euler15 {

	public static void main(String[] args) {
		Date start, end;
		start = new Date();
		BigInteger solution = factorial(40).divide(
				factorial(20).multiply(factorial(20)));
		end = new Date();
		System.out.println("There are " + solution + " routes");
		System.out.println("Executuion Time: " + (end.getTime()-start.getTime()));
	}

	public static BigInteger factorial(int n) {
		BigInteger fact = new BigInteger("1");
		for (int i = 1; i <= n; i++) {
			fact = fact.multiply(new BigInteger(Integer.toString(i)));
		}
		return fact;
	}

}
