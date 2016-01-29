import java.util.Date;
/*
Project Euler Problem 235
=========================

Given is the arithmetic-geometric sequence u(k) = (900-3k)r^k-1.
Let s(n) = Σ[k=1...n]u(k).

Find the value of r for which s(5000) = -600,000,000,000.

Give your answer rounded to 12 places behind the decimal point.
*/

public class Euler235 {
    public static void main(String[] args) {
        Date start, end;
        start = new Date();

        end = new Date();
        System.out.println("Execution Time: " + (end.getTime() -start.getTime()));
    }
}
