import java.util.Date;
/*
Project Euler Problem 195
=========================

Let's call an integer sided triangle with exactly one angle of 60 degrees
a 60-degree triangle.
Let r be the radius of the inscribed circle of such a 60-degree triangle.

There are 1234 60-degree triangles for which r 100.
Let T(n) be the number of 60-degree triangles for which r n, so
T(100) = 1234,  T(1000) = 22767, and  T(10000) = 359912.

Find T(1053779).
*/

public class Euler195 {
    public static void main(String[] args) {
        Date start, end;
        start = new Date();

        end = new Date();
        System.out.println("Execution Time: " + (end.getTime() -start.getTime()));
    }
}
