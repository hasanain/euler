
/*
 Project Euler Problem 3
 =======================

 The prime factors of 13195 are 5, 7, 13 and 29.

 What is the largest prime factor of the number 600851475143?
 */
package main
import (
    "fmt"
)

func main() {
    n := 600851475143
    i := 2
    max_factor := i
    for n != 1 {
        for n % i == 0 {
            max_factor = i
            n = int(n / i)
        }
        i += 1
    }
    fmt.Printf("factor: %v\n", max_factor)
}
