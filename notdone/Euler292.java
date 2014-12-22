import java.util.Date;
/*
Project Euler Problem 292
=========================

We shall define a Pythagorean polygon to be a convex polygon with the
following properties:

 • there are at least three vertices,
 • no three vertices are aligned,
 • each vertex has integer coordinates,
 • each edge has integer length.

For a given integer n, define P(n) as the number of distinct Pythagorean
polygons for which the perimeter is ≤ n.
Pythagorean polygons should be considered distinct as long as none is a
translation of another.

You are given that P(4) = 1, P(30) = 3655 and P(60) = 891045.
Find P(120).
*/

public class Euler292 {
    public static void main(String[] args) {
        Date start, end;
        start = new Date();

        end = new Date();
        System.out.println("Execution Time: " + (end.getTime() -start.getTime()));
    }
}
