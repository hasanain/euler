import java.util.Date;
/*
Project Euler Problem 180
=========================

For any integer n, consider the three functions

f[1,n](x,y,z) = x^n+1 + y^n+1 z^n+1
f[2,n](x,y,z) = (xy + yz + zx)*(x^n-1 + y^n-1 z^n-1)
f[3,n](x,y,z) = xyz*(x^n-2 + y^n-2 z^n-2)

and their combination

f[n](x,y,z) = f[1,n](x,y,z) + f[2,n](x,y,z) f[3,n](x,y,z)

We call (x,y,z) a golden triple of order k if x, y, and z are all rational
numbers of the form a / b with
0 < a < b k and there is (at least) one integer n, so that f[n](x,y,z) =
0.

Let s(x,y,z) = x + y + z.
Let t = u / v be the sum of all distinct s(x,y,z) for all golden triples
(x,y,z) of order 35.
All the s(x,y,z) and t must be in reduced form.

Find u + v.
*/

public class Euler180 {
    public static void main(String[] args) {
        Date start, end;
        start = new Date();

        end = new Date();
        System.out.println("Execution Time: " + (end.getTime() -start.getTime()));
    }
}
