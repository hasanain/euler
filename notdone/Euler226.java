import java.util.Date;
/*
Project Euler Problem 226
=========================

The blancmange curve is the set of points (x,y) such that 0 ≤ x ≤ 1 and

[Image: 226_formula.gif]

where s(x) = the distance from x to the nearest integer.

The area under the blancmange curve is equal to ½, shown in pink in the
diagram below.

[Image: 226_scoop2.gif]

Let C be the circle with centre (¼,½) and radius ¼, shown in black in the
diagram.

What area under the blancmange curve is enclosed by C?
Give your answer rounded to eight decimal places in the form 0.abcdefgh
*/

public class Euler226 {
    public static void main(String[] args) {
        Date start, end;
        start = new Date();

        end = new Date();
        System.out.println("Execution Time: " + (end.getTime() -start.getTime()));
    }
}
