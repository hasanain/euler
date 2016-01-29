import java.util.Date;
/*
Project Euler Problem 258
=========================

A sequence is defined as:

 • g[k] = 1, for 0 ≤ k ≤ 1999
 • g[k] = g[k-2000] + g[k-1999], for k ≥ 2000.

Find g[k] mod 20092010 for k = 10^18.
*/

public class Euler258 {
    public static void main(String[] args) {
        Date start, end;
        start = new Date();

        end = new Date();
        System.out.println("Execution Time: " + (end.getTime() -start.getTime()));
    }
}
