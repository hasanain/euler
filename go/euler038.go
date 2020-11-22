/*
Project Euler Problem 38
========================

Take the number 192 and multiply it by each of 1, 2, and 3:

  192 * 1 = 192
  192 * 2 = 384
  192 * 3 = 576

By concatenating each product we get the 1 to 9 pandigital, 192384576. We
will call 192384576 the concatenated product of 192 and (1,2,3)

The same can be achieved by starting with 9 and multiplying by 1, 2, 3, 4,
and 5, giving the pandigital, 918273645, which is the concatenated product
of 9 and (1,2,3,4,5).

What is the largest 1 to 9 pandigital 9-digit number that can be formed as
the concatenated product of an integer with (1,2, ... , n) where n > 1?
*/
package main
import (
    "fmt"
)
func isPandigital(n int) bool {
    m := make(map[int]bool)
    for n != 0 {
        d := n  % 10
        _, ok := m[d]
        if ok {
            return false
        }
        m[d] = true
        n = n / 10
    }
    _, hasZero := m[0]
    return len(m) == 9 && !hasZero
}
func main() {
    var n int
    max := 0
    max_n := 0
    max_m := 0
    for n = 0; n < 100000; n += 1 {
        a := 0
        var m int
        for m = 1; m < 10000; m += 1 {
            var t int
            t = n * m
            b := a
            r := 0
            for t != 0 {
                r = (10 * r) + (t % 10)
                t = t / 10
            }
            for r != 0 {
                b = (10 * b) + (r % 10)
                r = r / 10
            }
            if b > 1_000_000_000 {
                break
            }
            a = b
        }
        if m > 1 && a > max && isPandigital(a) {
            max = a
            max_n = n
            max_m = m
        }
    }
    fmt.Println(max_n, max_m, max)
}
