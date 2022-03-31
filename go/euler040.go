/*
Project Euler Problem 40
========================

An irrational decimal fraction is created by concatenating the positive
integers:

                  0.123456789101112131415161718192021...
                               ^

It can be seen that the 12th digit of the fractional part is 1.

If d[n] represents the n-th digit of the fractional part, find the value
of the following expression.

    d[1] * d[10] * d[100] * d[1000] * d[10000] * d[100000] * d[1000000]
*/
package main
import (
    "fmt"
    "strings"
)
func getDigits(limit int) string {
    var b strings.Builder
    for i := 1; b.Len() <= limit; i += 1 {
         fmt.Fprintf(&b, "%d", i)
    }
    return b.String()
}
func main() {
    d := getDigits(1000000)
    p := int(d[0] - '0')
   fmt.Printf("%d", p)
    for i := 10; i <= 1000000; i *= 10 {
        v := int(d[i - 1] - '0')
        fmt.Printf(" x %d", v)
        p *= v
    }
    fmt.Printf(" = %d", p)
}
