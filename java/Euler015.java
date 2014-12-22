import java.math.BigInteger;
import java.util.Date;
/*
Project Euler Problem 15
========================

Starting in the top left corner of a 2 * 2 grid, there are 6 routes
(without backtracking) to the bottom right corner.

How many routes are there through a 20 * 20 grid?
*/

public class Euler015 {
    public static void main(String[] args) {
        Date start, end;
        start = new Date();
        BigInteger solution = choose(40, 20);
        end = new Date();

        System.out.println("There are " + solution + " routes");
        System.out.println("Executuion Time: " + (end.getTime()-start.getTime()));
    }

    public static BigInteger factorial(int n) {
        BigInteger fact = new BigInteger("1");
        for (int i = 1; i <= n; i++) {
            fact = fact.multiply(new BigInteger(Integer.toString(i)));
        }
        return fact;
    }
    public static BigInteger choose(int n1, int n2){

        BigInteger l = new BigInteger("1");
        int top, bottom;
        top = ((n1-n2) > n1/2 ? n2 : n1-n2);
        bottom = ((n1-n2) > n1/2 ? n1-n2 : n2);
        for(int i = n1; i > top; i--){
            l = l.multiply(new BigInteger(Integer.toString(i)));
        }
        
        for(int i = bottom; i > 0; i--){
            l = l.divide(new BigInteger(Integer.toString(i)));
        }
        return l;
    }
}
