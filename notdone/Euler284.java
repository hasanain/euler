import java.util.Date;
/*
Project Euler Problem 284
=========================

The 3-digit number 376 in the decimal numbering system is an example of
numbers with the special property that its square ends with the same
digits: 376^2 = 141376. Let's call a number with this property a steady
square.

Steady squares can also be observed in other numbering systems. In the
base 14 numbering system, the 3-digit number c37 is also a steady square:
c37^2 = aa0c37, and the sum of its digits is c + 3 + 7 = 18 in the same
numbering system. The letters a, b, c and d are used for the 10, 11, 12
and 13 digits respectively, in a manner similar to the hexadecimal
numbering system.

For 1 ≤ n ≤ 9, the sum of the digits of all the n-digit steady squares in
the base 14 numbering system is 2d8 (582 decimal). Steady squares with
leading 0's are not allowed.

Find the sum of the digits of all the n-digit steady squares in the base
14 numbering system for 1 ≤ n ≤ 10000 (decimal) and give your answer in
the base 14 system using lower case letters where necessary.
*/

public class Euler284 {
    public static void main(String[] args) {
        Date start, end;
        start = new Date();

        end = new Date();
        System.out.println("Execution Time: " + (end.getTime() -start.getTime()));
    }
}
