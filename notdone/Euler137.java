import java.util.Date;
/*
Project Euler Problem 137
=========================

Consider the infinite polynomial series A[F](x) = xF[1] + x^2F[2] +
x^3F[3] + ..., where F[k] is the kth term in the Fibonacci sequence: 1, 1,
2, 3, 5, 8, ... ; that is, F[k] = F[k[1]] + F[k[2]], F[1] = 1 and F[2] =
1.

For this problem we shall be interested in values of x for which A[F](x)
is a positive integer.

Surprisingly A[F](1/2)  =  (1/2).1 + (1/2)^2.1 + (1/2)^3.2 + (1/2)^4.3 +
                           (1/2)^5.5 + ...
                        =  1/2 + 1/4 + 2/8 + 3/16 + 5/32 + ...
                        =  2

The corresponding values of x for the first five natural numbers are shown
below.

                            +---------------+
                            |x      |A[F](x)|
                            |-------+-------|
                            |21     |1      |
                            |-------+-------|
                            |1/2    |2      |
                            |-------+-------|
                            |(132)/3|3      |
                            |-------+-------|
                            |(895)/8|4      |
                            |-------+-------|
                            |(343)/5|5      |
                            +---------------+

We shall call A[F](x) a golden nugget if x is rational, because they
become increasingly rarer; for example, the 10th golden nugget is
74049690.

Find the 15th golden nugget.
*/

public class Euler137 {
    public static void main(String[] args) {
        Date start, end;
        start = new Date();

        end = new Date();
        System.out.println("Execution Time: " + (end.getTime() -start.getTime()));
    }
}
