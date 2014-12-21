import java.math.BigInteger;
import java.util.Date;
/*
Project Euler Problem 16
========================

2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

What is the sum of the digits of the number 2^1000?
*/

public class Euler016 {
    public static void main(String [] args){
        Date start, end;
        start = new Date();
        BigInteger i = new BigInteger("2");
        i = i.pow(1000);
        int sm =0;
        while(!i.equals(new BigInteger("0"))){
            sm = sm + Integer.parseInt(i.mod(new BigInteger("10")).toString());
            i = i.divide(new BigInteger("10"));
        }
        end = new Date();
        System.out.println(sm);
        System.out.println("Executuion Time: " + (end.getTime()-start.getTime()));
    }
}
