import java.util.Date;
/*
Project Euler Problem 97
========================

The first known prime found to exceed one million digits was discovered in
1999, and is a Mersenne prime of the form 2^69725931; it contains exactly
2,098,960 digits. Subsequently other Mersenne primes, of the form 2^p1,
have been found which contain more digits.

However, in 2004 there was found a massive non-Mersenne prime which
contains 2,357,207 digits: 28433 * 2^7830457+1.

Find the last ten digits of this prime number.
*/

public class Euler097 {
    public static void main(String[] args) {
        Date start, end;
        start = new Date();

        end = new Date();
        System.out.println("Execution Time: " + (end.getTime() -start.getTime()));
    }
}
