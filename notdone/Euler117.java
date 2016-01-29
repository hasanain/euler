import java.util.Date;
/*
Project Euler Problem 117
=========================

Using a combination of black square tiles and oblong tiles chosen from:
red tiles measuring two units, green tiles measuring three units, and blue
tiles measuring four units, it is possible to tile a row measuring five
units in length in exactly fifteen different ways.

                      +----+  +----+  +----+  +----+
                      +----+  +----+  +----+  +----+

                      +----+  +----+  +----+  +----+
                      +----+  +----+  +----+  +----+

                      +----+  +----+  +----+  +----+
                      +----+  +----+  +----+  +----+

                      +----+  +----+  +----+
                      +----+  +----+  +----+

How many ways can a row measuring fifty units in length be tiled?

NOTE: This is related to problem 116.
*/

public class Euler117 {
    public static void main(String[] args) {
        Date start, end;
        start = new Date();

        end = new Date();
        System.out.println("Execution Time: " + (end.getTime() -start.getTime()));
    }
}
