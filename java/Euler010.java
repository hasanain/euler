import java.util.Date;
/*
Project Euler Problem 10
========================

The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
*/

public class Euler010 {
    public static void main(String[] args) {
        Date start, end;
        start = new Date();
        long prime = 3;
        long primeSum = 2;

        while (prime < 2000000) {

            if (isPrime(prime)) {

                primeSum += prime;
            }
            prime += 2;
        }
        System.out.println(primeSum);
        end = new Date();
        System.out.println("Execution Time: " + (end.getTime() -start.getTime()));
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
