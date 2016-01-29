import java.util.Date;

/*
 Project Euler Problem 1
 =======================

 If we list all the natural numbers below 10 that are multiples of 3 or 5,
 we get 3, 5, 6 and 9. The sum of these multiples is 23.

 Find the sum of all the multiples of 3 or 5 below 1000.
 */

public class Euler001 {
    public static void main(String[] args) {
        Date start, end;
        start = new Date();

        int sum = 23;
        for (int i = 10; i < 1000; i++)
            sum = (i % 5 == 0 || i % 3 == 0) ? sum + i : sum;

        end = new Date();
        System.out.println("The sum = " + sum);
        System.out.println("Execution Time: "
                + (end.getTime() - start.getTime()));
    }
}
