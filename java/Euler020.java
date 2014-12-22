import java.math.BigInteger;
import java.util.Date;

/*
 Project Euler Problem 20
 ========================

 n! means n * (n - 1) * ... * 3 * 2 * 1

 Find the sum of the digits in the number 100!
 */

public class Euler020 {
    public static void main(String[] args) {
        Date start, end;
        start = new Date();
        BigInteger integer = factorial(100);
        BigInteger sum = new BigInteger("0");
        while (!integer.equals(new BigInteger("0"))) {
            sum = sum.add(integer.mod(new BigInteger("10")));
            integer = integer.divide((new BigInteger("10")));
        }
        end = new Date();
        System.out.println(sum);
        System.out.println("Execution Time: "
                + (end.getTime() - start.getTime()));
    }

    public static BigInteger factorial(int n) {
        BigInteger fact = new BigInteger("1");
        for (int i = 1; i <= n; i++) {
            fact = fact.multiply(new BigInteger(Integer.toString(i)));
        }
        return fact;
    }
}
