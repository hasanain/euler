import java.util.Date;
/*
Project Euler Problem 184
=========================

Consider the set I[r] of points (x,y) with integer co-ordinates in the
interior of the circle with radius r, centered at the origin, i.e. x^2 +
y^2 < r^2.

For a radius of 2, I[2] contains the nine points (0,0), (1,0), (1,1),
(0,1), (-1,1), (-1,0), (-1,-1), (0,-1) and (1,-1). There are eight
triangles having all three vertices in I[2] which contain the origin in
the interior. Two of them are shown below, the others are obtained from
these by rotation.

For a radius of 3, there are 360 triangles containing the origin in the
interior and having all vertices in I[3] and for I[5] the number is 10600.

How many triangles are there containing the origin in the interior and
having all three vertices in I[105]?
*/

public class Euler184 {
    public static void main(String[] args) {
        Date start, end;
        start = new Date();

        end = new Date();
        System.out.println("Execution Time: " + (end.getTime() -start.getTime()));
    }
}
