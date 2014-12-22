import java.util.Date;
/*
Project Euler Problem 123
=========================

Let p[n] be the nth prime: 2, 3, 5, 7, 11, ..., and let r be the remainder
when (p[n]1)^n + (p[n]+1)^n is divided by p[n]^2.

For example, when n = 3, p[3] = 5, and 4^3 + 6^3 = 280 5 mod 25.

The least value of n for which the remainder first exceeds 10^9 is 7037.

Find the least value of n for which the remainder first exceeds 10^10.
*/

public class Euler123 {
    public static void main(String[] args) {
        Date start, end;
        start = new Date();

        end = new Date();
        System.out.println("Execution Time: " + (end.getTime() -start.getTime()));
    }
}
