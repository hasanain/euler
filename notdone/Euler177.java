import java.util.Date;
/*
Project Euler Problem 177
=========================

Let ABCD be a convex quadrilateral, with diagonals AC and BD. At each
vertex the diagonal makes an angle with each of the two sides, creating
eight corner angles.

For example, at vertex A, the two angles are CAD, CAB.

We call such a quadrilateral for which all eight corner angles have
integer values when measured in degrees an "integer angled quadrilateral".
An example of an integer angled quadrilateral is a square, where all eight
corner angles are 45DEG. Another example is given by DAC = 20DEG, BAC =
60DEG, ABD = 50DEG, CBD = 30DEG, BCA = 40DEG, DCA = 30DEG, CDB = 80DEG,
ADB = 50DEG.

What is the total number of non-similar integer angled quadrilaterals?

Note: In your calculations you may assume that a calculated angle is
integral if it is within a tolerance of 10^-9 of an integer value.
*/

public class Euler177 {
    public static void main(String[] args) {
        Date start, end;
        start = new Date();

        end = new Date();
        System.out.println("Execution Time: " + (end.getTime() -start.getTime()));
    }
}
