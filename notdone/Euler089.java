import java.util.Date;
/*
Project Euler Problem 89
========================

The rules for writing Roman numerals allow for many ways of writing each
number. However, there is always a "best" way of writing a particular number.

For example, the following represent all of the legitimate ways of writing
the number sixteen:

IIIIIIIIIIIIIIII
VIIIIIIIIIII
VVIIIIII
XIIIIII
VVVI
XVI

The last example being considered the most efficient, as it uses the least
number of numerals.

The 11K text file roman.txt contains one thousand numbers written in valid,
but not necessarily minimal, Roman numerals; that is, they are arranged in
descending units and obey the subtractive pair rule (see FAQ for the
definitive rules for this problem).

Find the number of characters saved by writing each of these in their
minimal form.

Note: You can assume that all the Roman numerals in the file contain no
more than four consecutive identical units.

FAQ Link: http://projecteuler.net/about=roman_numerals
*/

public class Euler089 {
    public static void main(String[] args) {
        Date start, end;
        start = new Date();

        end = new Date();
        System.out.println("Execution Time: " + (end.getTime() -start.getTime()));
    }
}
