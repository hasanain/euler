import java.util.Date;
/*
Project Euler Problem 241
=========================

For a positive integer n, let σ(n) be the sum of all divisors of n, so
e.g. σ(6) = 1 + 2 + 3 + 6 = 12.

A perfect number, as you probably know, is a number with σ(n) = 2n.

Let us define the perfection quotient of a positive integer as
p(n) = σ(n) / n.

Find the sum of all positive integers n ≤ 10^18 for which p(n) has the
form k + ^1⁄[2], where k is an integer.
*/

public class Euler241 {
    public static void main(String[] args) {
        Date start, end;
        start = new Date();

        end = new Date();
        System.out.println("Execution Time: " + (end.getTime() -start.getTime()));
    }
}
