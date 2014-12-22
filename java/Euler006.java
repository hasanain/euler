import java.util.Date;

/*
 Project Euler Problem 6
 =======================

 The sum of the squares of the first ten natural numbers is,
 1^2 + 2^2 + ... + 10^2 = 385

 The square of the sum of the first ten natural numbers is,
 (1 + 2 + ... + 10)^2 = 55^2 = 3025

 Hence the difference between the sum of the squares of the first ten
 natural numbers and the square of the sum is 3025 - 385 = 2640.

 Find the difference between the sum of the squares of the first one
 hundred natural numbers and the square of the sum.
 */

public class Euler006 {
    public static void main(String[] args) {
        Date start, end;
        start = new Date();
        

        int number = 0; // the number is going to incremented to 100
        int sum1 = 0; // the sum of the numbers after being squared i.e.: 1^2
                      // +2^2 ...
        int sum2 = 0; // the sum of the numbers squared(1+2+3...)^2
        
        for (number = 0; number <= 100; number++)
            sum1 += Math.pow(number, 2);

        for (number = 0; number <= 100; number++)
            sum2 += number;

        sum2 = (int) Math.pow(sum2, 2);
        
        end = new Date();
        System.out.println("The difference: " + (sum2 - sum1));
        System.out.println("Execution Time: "
                + (end.getTime() - start.getTime()));
    }
}
