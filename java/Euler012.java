import java.util.Date;

/*
 Project Euler Problem 12
 ========================

 The sequence of triangle numbers is generated by adding the natural
 numbers. So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 =
 28. The first ten terms would be:

 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...

 Let us list the factors of the first seven triangle numbers:

 1: 1
 3: 1,3
 6: 1,2,3,6
 10: 1,2,5,10
 15: 1,3,5,15
 21: 1,3,7,21
 28: 1,2,4,7,14,28

 We can see that 28 is the first triangle number to have over five
 divisors.

 What is the value of the first triangle number to have over five hundred
 divisors?
 */

public class Euler012 {

    public static void main(String[] args) {
        Date start, end;
        start = new Date();
        int divisors = 0;
        int n = 1; // the current index of the triangle number used to geneerate
                   // triangle numbers
        int currTriangle = 1;
        int o = 0;
        while (true) {

            divisors = 0;
            // since every number has the same number of divisors below the
            // square root as above the square root there is no need to count to
            // 500. All we need is to find some number with 250 divisors below
            // the square root.
            o = (int) Math.sqrt(currTriangle);
            for (int i = 1; i < o; i++)
                divisors = currTriangle % i == 0 ? ++divisors : divisors;

            if (divisors >= 250) {
                break;
            }
            currTriangle += ++n;

        }
        end = new Date();
        System.out.printf("The Traingle number is: %d\n", currTriangle);
        System.out.println("Execution time = "
                + (end.getTime() - start.getTime()));

    }

    // method to generate triangle numbers, not called anymore.
    public static int triangle(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
