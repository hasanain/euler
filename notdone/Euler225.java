import java.util.Date;
/*
Project Euler Problem 225
=========================

The sequence 1, 1, 1, 3, 5, 9, 17, 31, 57, 105, 193, 355, 653, 1201 ...
is defined by T[1] = T[2] = T[3] = 1 and T[n] = T[n-1] + T[n-2] + T[n-3].

It can be shown that 27 does not divide any terms of this sequence.
In fact, 27 is the first odd number with this property.

Find the 124th odd number that does not divide any terms of the above
sequence.
*/

public class Euler225 {
    public static void main(String[] args) {
        Date start, end;
        start = new Date();

        end = new Date();
        System.out.println("Execution Time: " + (end.getTime() -start.getTime()));
    }
}
