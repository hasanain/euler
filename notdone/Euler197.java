import java.util.Date;
/*
Project Euler Problem 197
=========================

Given is the function f(x) = 2^30.403243784-x^2 * 10^-9 ( is the
floor-function),
the sequence u[n] is defined by u[0] = -1 and u[n+1] = f(u[n]).

Find u[n] + u[n+1] for n = 10^12.
Give your answer with 9 digits after the decimal point.
*/

public class Euler197 {
    public static void main(String[] args) {
        Date start, end;
        start = new Date();

        end = new Date();
        System.out.println("Execution Time: " + (end.getTime() -start.getTime()));
    }
}
