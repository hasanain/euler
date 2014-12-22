import java.util.Date;
/*
Project Euler Problem 209
=========================

A k-input binary truth table is a map from k input bits(binary digits, 0
[false] or 1 [true]) to 1 output bit. For example, the 2-input binary
truth tables for the logical AND and XOR functions are:

            ┌────┬────┬─────────┐        ┌────┬────┬─────────┐
            │ x  │ y  │ x AND y │        │ x  │ y  │ x XOR y │
            ├────┼────┼─────────┤        ├────┼────┼─────────┤
            │ 0  │ 0  │    0    │        │ 0  │ 0  │    0    │
            ├────┼────┼─────────┤        ├────┼────┼─────────┤
            │ 0  │ 1  │    0    │        │ 0  │ 1  │    1    │
            ├────┼────┼─────────┤        ├────┼────┼─────────┤
            │ 1  │ 0  │    0    │        │ 1  │ 0  │    1    │
            ├────┼────┼─────────┤        ├────┼────┼─────────┤
            │ 1  │ 1  │    1    │        │ 1  │ 1  │    0    │
            └────┴────┴─────────┘        └────┴────┴─────────┘

How many 6-input binary truth tables, τ, satisfy the formula

     τ(a, b, c, d, e, f) AND τ(b, c, d, e, f, a XOR (b AND c)) = 0
*/

public class Euler209 {
    public static void main(String[] args) {
        Date start, end;
        start = new Date();

        end = new Date();
        System.out.println("Execution Time: " + (end.getTime() -start.getTime()));
    }
}
