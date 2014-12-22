import java.util.Date;
/*
Project Euler Problem 7
=======================

By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
that the 6th prime is 13.

What is the 10001st prime number?
*/

public class Euler007 {
    public static void main(String[] args) {
        Date start, end;
        start = new Date();
        
        long prime = 0;
        int counter = 0;
        long primeCandidate = 0;
        while (counter < 10001) {

            if (isPrime(primeCandidate)) {
                if (counter == 10000) {
                    prime = primeCandidate;
                    break;
                }
                counter++;
            }

            primeCandidate++;
        }
        System.out.println(prime);
        end = new Date();
        
        System.out.println("Execution Time: " + (end.getTime() -start.getTime()));
    }
    public static boolean isPrime(long num) {

        if (num == 0 || num == 1)
            return false;
        if (num < 4)
            return true;
        if (num % 2 == 0)
            return false;
        if (num < 9)
            return true;
        if (num % 3 == 0)
            return false;
        else {

            int sqrt = (int) Math.floor(Math.sqrt(num));
            int f = 5;

            while (f <= sqrt) {
                if (num % f == 0)
                    return false;
                if (num % (f + 2) == 0)
                    return false;
                f += 6;
            }
            return true;
        }
    }
}
