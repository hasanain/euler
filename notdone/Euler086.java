import java.util.Date;
/*
Project Euler Problem 86
========================

A spider, S, sits in one corner of a cuboid room, measuring 6 by 5 by 3,
and a fly, F, sits in the opposite corner. By travelling on the surfaces
of the room the shortest "straight line" distance from S to F is 10 and
the path is shown on the diagram.

However, there are up to three "shortest" path candidates for any given
cuboid and the shortest route is not always integer.

By considering all cuboid rooms up to a maximum size of M by M by M, there
are exactly 2060 cuboids for which the shortest distance is integer when
M=100, and this is the least value of M for which the number of solutions
first exceeds two thousand; the number of solutions is 1975 when M=99.

Find the least value of M such that the number of solutions first exceeds
one million.
*/

public class Euler086 {
    public static void main(String[] args) {
        Date start, end;
        start = new Date();

        end = new Date();
        System.out.println("Execution Time: " + (end.getTime() -start.getTime()));
    }
}
