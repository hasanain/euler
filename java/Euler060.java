import java.util.Date;
/*
Project Euler Problem 60
========================

The primes 3, 7, 109, and 673, are quite remarkable. By taking any two
primes and concatenating them in any order the result will always be
prime. For example, taking 7 and 109, both 7109 and 1097 are prime. The
sum of these four primes, 792, represents the lowest sum for a set of four
primes with this property.

Find the lowest sum for a set of five primes for which any two primes
concatenate to produce another prime.
*/

public class Euler060 {
    public static void main(String[] args) {
        Date start, end;
        start = new Date();
        int[] primes = { 5, 3, 3, 3 };
        int i = 0, j = 0, k = 0, l = 0;
        for (i = 0; i <= primes[0];) {
            for (j = 0; j <= i; j++) {
                for (k = 0; k <= i; k++) {
                    for (l = 0; l <= i; l++) {

                    }
                }
                while (!isPrime(++i))
                    ;
            }
        }

        while (!isPrime(++i));
        System.out.printf("%d %d %d %d\n", i, j, k, l);

        end = new Date();
        System.out.println();
        System.out.println("Execution time: "
                + (end.getTime() - start.getTime()));
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
