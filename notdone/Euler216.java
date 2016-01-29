import java.util.Date;
/*
Project Euler Problem 216
=========================

 Consider numbers t(n) of the form t(n) = 2n^2-1 with n > 1.
 The first such numbers are 7, 17, 31, 49, 71, 97, 127 and 161.
 It turns out that only 49 = 7*7 and 161 = 7*23 are not prime.
 For n ≤ 10000 there are 2202 numbers t(n) that are prime.

 How many numbers t(n) are prime for n ≤ 50,000,000?
*/

public class Euler216 {
    public static void main(String[] args) {
        Date start, end;
        start = new Date();

        end = new Date();
        System.out.println("Execution Time: " + (end.getTime() -start.getTime()));
    }
}
