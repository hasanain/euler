import java.util.Date;
/*
Project Euler Problem 255
=========================

We define the rounded-square-root of a positive integer n as the square
root of n rounded to the nearest integer.

The following procedure (essentially Heron's method adapted to integer
arithmetic) finds the rounded-square-root of n:

Let d be the number of digits of the number n.
If d is odd, set x[0] = 2×10^((d-1)⁄/2).
If d is even, set x[0] = 7×10^((d-2)⁄/2).
Repeat:

[Image: 255_Heron.gif]

until x[k+1] = x[k].

As an example, let us find the rounded-square-root of n = 4321.
n has 4 digits, so x[0] = 7×10^(4-2)⁄2 = 70.

[Image: 255_Example.gif]

Since x[2] = x[1], we stop here.
So, after just two iterations, we have found that the rounded-square-root
of 4321 is 66 (the actual square root is 65.7343137…).

The number of iterations required when using this method is surprisingly
low.
For example, we can find the rounded-square-root of a 5-digit integer
(10,000 ≤ n ≤ 99,999) with an average of 3.2102888889 iterations (the
average value was rounded to 10 decimal places).

Using the procedure described above, what is the average number of
iterations required to find the rounded-square-root of a 14-digit number
(10^13 ≤ n < 10^14)?
Give your answer rounded to 10 decimal places.

Note: The symbols ⌊x⌋ and ⌈x⌉ represent the floor function and ceiling
function respectively.
*/

public class Euler255 {
    public static void main(String[] args) {
        Date start, end;
        start = new Date();

        end = new Date();
        System.out.println("Execution Time: " + (end.getTime() -start.getTime()));
    }
}
