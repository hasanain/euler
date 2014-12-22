import java.util.Date;

/*
 Project Euler Problem 5
 =======================

 2520 is the smallest number that can be divided by each of the numbers
 from 1 to 10 without any remainder.

 What is the smallest number that is evenly divisible by all of the numbers
 from 1 to 20?
 */

public class Euler005 {
    public static void main(String[] args) {
        Date start, end;
        start = new Date();
        
        int sm = 0;
        int i = 2520;
        boolean stat = true;
        
        while (stat) {
            if (i % 20 == 0 && i % 19 == 0 && i % 18 == 0 && i % 17 == 0
                    && i % 16 == 0 && i % 15 == 0 && i % 14 == 0 && i % 13 == 0
                    && i % 12 == 0 && i % 11 == 0) {
                sm = i;
                stat = false;
            }
            i++;
        }

        end = new Date();
        System.out.println("The number is: " + sm);
        System.out.println("Execution Time: "
                + (end.getTime() - start.getTime()));
    }
}
