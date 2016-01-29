import java.util.Date;
/*
Project Euler Problem 266
=========================

The divisors of 12 are: 1, 2, 3, 4, 6, and 12.
The largest divisor of 12 that does not exceed the square root of 12 is 3.
We shall call the largest divisor of an integer n that does not exceed the
square root of n the pseudo square root (PSR) of n.
It can be seen that PSR(3102) = 47.

Let p be the product of the primes below 190. Find PSR(p) mod 10^16.
*/

public class Euler266 {
    public static void main(String[] args) {
        Date start, end;
        start = new Date();

        end = new Date();
        System.out.println("Execution Time: " + (end.getTime() -start.getTime()));
    }
}
