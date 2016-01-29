import java.util.Date;
/*
Project Euler Problem 194
=========================

Consider graphs built with the units A: and B: , where the units are glued
alongthe vertical edges as in the graph .

A configuration of type (a,b,c) is a graph thus built of a units A and b
units B, where the graph's vertices are coloured using up to c colours, so
that no two adjacent vertices have the same colour.
The compound graph above is an example of a configuration of type (2,2,6),
in fact of type (2,2,c) for all c 4.

Let N(a,b,c) be the number of configurations of type (a,b,c).
For example, N(1,0,3) = 24, N(0,2,4) = 92928 and N(2,2,3) = 20736.

Find the last 8 digits of N(25,75,1984).
*/

public class Euler194 {
    public static void main(String[] args) {
        Date start, end;
        start = new Date();

        end = new Date();
        System.out.println("Execution Time: " + (end.getTime() -start.getTime()));
    }
}
