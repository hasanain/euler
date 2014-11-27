import java.util.Date;

/*
 Project Euler Problem 9
 =======================

 A Pythagorean triplet is a set of three natural numbers, a < b < c, for
 which,
 a^2 + b^2 = c^2

 For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

 There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 Find the product abc.
 */

public class Euler009 {
    public static void main(String[] args) {
        Date start, end;
        start = new Date();

        int sum = 1000;
        int product = 0;
        for (int a = 0; a < sum / 3; a++) {
            for (int b = 0; b < sum / 2; b++) {
                int c = sum - (a + b);
                if ((c > 0) && (a * a + b * b == c * c)) {
                    product = a * b * c;
                }
            }
        }

        System.out.println(product);
        end = new Date();
        System.out.println("Execution Time: "
                + (end.getTime() - start.getTime()));
    }
}
