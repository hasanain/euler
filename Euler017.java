import java.util.ArrayList;
import java.util.Date;
/*
Project Euler Problem 17
========================

If the numbers 1 to 5 are written out in words: one, two, three, four,
five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.

If all the numbers from 1 to 1000 (one thousand) inclusive were written
out in words, how many letters would be used?

NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and
forty-two) contains 23 letters and 115 (one hundred and fifteen) contains
20 letters. The use of "and" when writing out numbers is in compliance
with British usage.
*/

public class Euler017 {
    public static void main(String[] args) {
        Date start, end;
        start = new Date();
        
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            count += numberToLetters(i).length();
        }
        end = new Date();
        System.out.println(count);
        System.out.println("Execution time: " + (end.getTime() - start.getTime()));
        
    }

    public static String numberToLetters(int n) {
        String[] singles = { "", "one", "two", "three", "four", "five", "six",
                "seven", "eight", "nine" };
        String[] teens = { "", "eleven", "twelve", "thirteen", "fourteen",
                "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
        String[] tens = { "", "ten", "twenty", "thirty", "fourty", "fifty",
                "sixty", "seventy", "eighty", "ninty" };
        String[] hundreds = { "", "onehundred", "twohundred", "threehundred",
                "fourhundred", "fivehundred", "sixhundred", "sevenhundred",
                "eighthundred", "ninehundred" };
        String str = "";
        ArrayList<Integer> rg = new ArrayList<Integer>();
        int i = 0;

        if (n == 0) {
            return "zero";
        }
        if((n> 10 && n < 20) ){
            return teens[n-10];
        }
        if((n% 100> 10 && n%100 < 20) ){
            return hundreds[n/100]+"and"+teens[n%100-10];
        }
        if (n == 1000) {
            return "onethousand";
        }
        if (n % 100 == 0) {
            return hundreds[n / 100];
        }
        while (n != 0) {
            rg.add(n % 10);
            n = n / 10;
            i++;
        }
        for (i = rg.size() - 1; i >= 0; i--) {
            if (i == 0) {
                str = str + singles[rg.get(i)];
            }
            if (i == 1) {
                str = str + tens[rg.get(i)];
            }
            if (i == 2) {
                str = str + hundreds[rg.get(i)] + "and";
            }

        }
        return str;
    }
}
