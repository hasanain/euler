import java.util.Date;
/*
Project Euler Problem 221
=========================

We shall call a positive integer A an "Alexandrian integer", if there
exist integers p, q, r such that:

A = p · q · r    and   1 = 1 + 1 + 1
                      A   p   q   r

For example, 630 is an Alexandrian integer (p = 5, q = −7, r = −18).In
fact, 630 is the 6th Alexandrian integer, the first 6 Alexandrian
integers being: 6, 42, 120, 156, 420 and 630.

Find the 150000th Alexandrian integer.
*/

public class Euler221 {
    public static void main(String[] args) {
        Date start, end;
        start = new Date();

        end = new Date();
        System.out.println("Execution Time: " + (end.getTime() -start.getTime()));
    }
}
