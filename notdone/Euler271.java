import java.util.Date;
/*
Project Euler Problem 271
=========================

For a positive number n, define S(n) as the sum of the integers x, for
which 1 < x < n and x^3 ≡ 1 mod n.

When n=91, there are 8 possible values for x, namely: 9, 16, 22, 29, 53,
74, 79, 81. Thus, S(91)=9+16+22+29+53+74+79+81=363.

Find S(13082761331670030).
*/

public class Euler271 {
    public static void main(String[] args) {
        Date start, end;
        start = new Date();

        end = new Date();
        System.out.println("Execution Time: " + (end.getTime() -start.getTime()));
    }
}
