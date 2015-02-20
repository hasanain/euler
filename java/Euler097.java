import java.math.BigInteger;
import java.util.Date;
/*
Project Euler Problem 97
========================

The first known prime found to exceed one million digits was discovered in
1999, and is a Mersenne prime of the form 2^69725931; it contains exactly
2,098,960 digits. Subsequently other Mersenne primes, of the form 2^p1,
have been found which contain more digits.

However, in 2004 there was found a massive non-Mersenne prime which
contains 2,357,207 digits: 28433 * 2^7830457+1.

Find the last ten digits of this prime number.
*/

public class Euler097 {
    public static void main(String[] args) {
        Date start, end;
        start = new Date();
//        String s = "28433×2^7830457+1";
//        BigInteger j = new BigInteger("2");
//        j = j.pow(7830457);
//        j = j.multiply(new BigInteger("28433"));
//        j = j.add(new BigInteger("1"));
//        System.out.println(j.mod(new BigInteger("10000000000")));
        
        
        long i = 28433l;
        for(int r = 1; r <=7830457; r++){
        	i *=2;
        	i%=10000000000l;
        }
        i++;
        System.out.println(i);
        end = new Date();
        System.out.println("Execution Time: " + (end.getTime() -start.getTime()));
    }
}
