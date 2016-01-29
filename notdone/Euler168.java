import java.util.Date;
/*
Project Euler Problem 168
=========================

Consider the number 142857. We can right-rotate this number by moving the
last digit (7) to the front of it, giving us 714285.
It can be verified that 714285=5 * 142857.
This demonstrates an unusual property of 142857: it is a divisor of its
right-rotation.

Find the last 5 digits of the sum of all integers n, 10 < n < 10^100, that
have this property.
*/

public class Euler168 {
    public static void main(String[] args) {
        Date start, end;
        start = new Date();

        end = new Date();
        System.out.println("Execution Time: " + (end.getTime() -start.getTime()));
    }
}
