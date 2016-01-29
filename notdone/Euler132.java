import java.util.Date;
/*
Project Euler Problem 132
=========================

A number consisting entirely of ones is called a repunit. We shall define
R(k) to be a repunit of length k.

For example, R(10) = 1111111111 = 11 * 41 * 271 * 9091, and the sum of
these prime factors is 9414.

Find the sum of the first forty prime factors of R(10^9).
*/

public class Euler132 {
    public static void main(String[] args) {
        Date start, end;
        start = new Date();

        end = new Date();
        System.out.println("Execution Time: " + (end.getTime() -start.getTime()));
    }
}
