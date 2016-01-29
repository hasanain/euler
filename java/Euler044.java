import java.util.Date;
/*
Project Euler Problem 44
========================

Pentagonal numbers are generated by the formula, P[n]=n(3n-1)/2. The first
ten pentagonal numbers are:

               1, 5, 12, 22, 35, 51, 70, 92, 117, 145, ...

It can be seen that P[4] + P[7] = 22 + 70 = 92 = P[8]. However, their
difference, 70 - 22 = 48, is not pentagonal.

Find the pair of pentagonal numbers, P[j] and P[k], for which their sum
and difference is pentagonal and D = |P[k] - P[j]| is minimised; what is
the value of D?
*/

public class Euler044 {
    public static void main(String[] args) {
        Date start, end;
        start = new Date();
        
        end = new Date();
        System.out.println("Execution Time: " + (end.getTime() -start.getTime()));
    }
    public static int pentagonal(int n){
    	return n*(3*n-1)/2;
    }
    public static boolean isPentagonal(double p){
    	
    	return isInteger((1+ Math.sqrt(1+24*p))/6) ;
    }
    public static boolean isInteger(double p){
    	return p == Math.floor(p);
    }
}
