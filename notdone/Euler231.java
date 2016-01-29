import java.util.Date;
/*
Project Euler Problem 231
=========================

The binomial coefficient ^10C[3] = 120.
120 = 2^3 × 3 × 5 = 2 × 2 × 2 × 3 × 5, and 2 + 2 + 2 + 3 + 5 = 14.
So the sum of the terms in the prime factorisation of ^10C[3] is 14.

Find the sum of the terms in the prime factorisation of
^20000000C[15000000].
*/

public class Euler231 {
    public static void main(String[] args) {
        Date start, end;
        start = new Date();

        end = new Date();
        System.out.println("Execution Time: " + (end.getTime() -start.getTime()));
    }
}
