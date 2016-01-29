import java.util.Date;
/*
Project Euler Problem 188
=========================

The hyperexponentiation or tetration of a number a by a positive integer
b, denoted by a-^-^b or ^ba, is recursively defined by:

a-^-^1 = a,
a-^-^(k+1) = a^(a-^-^k).

Thus we have e.g. 3-^-^2 = 3^3 = 27, hence 3-^-^3 = 3^27 = 7625597484987
and 3-^-^4 is roughly 10^3.6383346400240996*10^12.

Find the last 8 digits of 1777-^-^1855.
*/

public class Euler188 {
    public static void main(String[] args) {
        Date start, end;
        start = new Date();

        end = new Date();
        System.out.println("Execution Time: " + (end.getTime() -start.getTime()));
    }
}
