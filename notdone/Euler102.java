import java.util.Date;
/*
Project Euler Problem 102
=========================

Three distinct points are plotted at random on a Cartesian plane, for
which -1000 x, y 1000, such that a triangle is formed.

Consider the following two triangles:

                  A(-340,495), B(-153,-910), C(835,-947)

                  X(-175,41), Y(-421,-714), Z(574,-645)

It can be verified that triangle ABC contains the origin, whereas triangle
XYZ does not.

Using triangles.txt, a 27K text file containing the co-ordinates of one
thousand "random" triangles, find the number of triangles for which the
interior contains the origin.

NOTE: The first two examples in the file represent the triangles in the
example given above.
*/

public class Euler102 {
    public static void main(String[] args) {
        Date start, end;
        start = new Date();

        end = new Date();
        System.out.println("Execution Time: " + (end.getTime() -start.getTime()));
    }
}
