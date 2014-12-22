import java.util.Date;
/*
Project Euler Problem 286
=========================

Barbara is a mathematician and a basketball player. She has found that the
probability of scoring a point when shooting from a distance x is exactly
(1 - ^x/[q]), where q is a real constant greater than 50.

During each practice run, she takes shots from distances x = 1, x = 2,
..., x = 50 and, according to her records, she has precisely a 2 % chance
to score a total of exactly 20 points.

Find q and give your answer rounded to 10 decimal places.
*/

public class Euler286 {
    public static void main(String[] args) {
        Date start, end;
        start = new Date();

        end = new Date();
        System.out.println("Execution Time: " + (end.getTime() -start.getTime()));
    }
}
