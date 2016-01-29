import java.util.Date;
/*
Project Euler Problem 120
=========================

Let r be the remainder when (a1)^n + (a+1)^n is divided by a^2.

For example, if a = 7 and n = 3, then r = 42: 6^3 + 8^3 = 728 42 mod 49.
And as n varies, so too will r, but for a = 7 it turns out that r[max] =
42.

For 3 a 1000, find r[max].
*/

public class Euler120 {
    public static void main(String[] args) {
        Date start, end;
        start = new Date();

        end = new Date();
        System.out.println("Execution Time: " + (end.getTime() -start.getTime()));
    }
}
