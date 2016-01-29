import java.util.Date;
/*
Project Euler Problem 171
=========================

For a positive integer n, let f(n) be the sum of the squares of the digits
(in base 10) of n, e.g.

f(3) = 3^2 = 9,
f(25) = 2^2 + 5^2 = 4 + 25 = 29,
f(442) = 4^2 + 4^2 + 2^2 = 16 + 16 + 4 = 36

Find the last nine digits of the sum of all n, 0 < n < 10^20, such that
f(n) is a perfect square.
*/

public class Euler171 {
    public static void main(String[] args) {
        Date start, end;
        start = new Date();

        end = new Date();
        System.out.println("Execution Time: " + (end.getTime() -start.getTime()));
    }
}
