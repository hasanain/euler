import java.util.Date;

/*
 Project Euler Problem 4
 =======================

 A palindromic number reads the same both ways. The largest palindrome made
 from the product of two 2-digit numbers is 9009 = 91 * 99.

 Find the largest palindrome made from the product of two 3-digit numbers.
 */

public class Euler004 {
    public static void main(String[] args) {
        Date start, end;
        start = new Date();

        int largestP = 0;
        int product = 0;
        for (int i = 100; i < 1000; i++) {

            for (int j = 100; j < 1000; j++) {

                if ((product = i * j) == numberReversed(product)) {

                    if ((product) > largestP) {

                        largestP = product;
                    }
                }

            }
        }
        end = new Date();
        System.out.println("The Largest Palidrome = " + largestP);
        System.out.println("Execution Time: "
                + (end.getTime() - start.getTime()));
    }

    public static int numberReversed(int i) {

        String str = "";
        while (i > 0) {
            str += String.valueOf(i % 10);
            i = i / 10;
        }
        return Integer.parseInt(str);

    }
}
