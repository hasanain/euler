import java.util.Date;
/*
Project Euler Problem 217
=========================

A positive integer with k (decimal) digits is called balanced if its first
⌈^k/[2]⌉ digits sum to the same value as its last ⌈^k/[2]⌉ digits, where
⌈x⌉, pronounced ceiling of x, is the smallest integer ≥ x, thus ⌈π⌉ = 4
and ⌈5⌉ = 5.

So, for example, all palindromes are balanced, as is 13722.

Let T(n) be the sum of all balanced numbers less than 10^n.
Thus: T(1) = 45, T(2) = 540 and T(5) = 334795890.

Find T(47) mod 3^15
*/

public class Euler217 {
    public static void main(String[] args) {
        Date start, end;
        start = new Date();

        end = new Date();
        System.out.println("Execution Time: " + (end.getTime() -start.getTime()));
    }
}
