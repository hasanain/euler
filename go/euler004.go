
/*
 Project Euler Problem 4
 =======================

 A palindromic number reads the same both ways. The largest palindrome made
 from the product of two 2-digit numbers is 9009 = 91 * 99.

 Find the largest palindrome made from the product of two 3-digit numbers.
 */

package main
import(
    "fmt"
)

func main() {
    mp := 0
    for m := 100; m < 1000; m += 1 {
        for n := 100; n < 1000; n += 1 {
            p := m * n
            if isPalindrome(p) {
                if p > mp {
                    mp = p
                }
            }
        }
    }
    fmt.Printf("max palindrome: %v\n", mp)
}

func isPalindrome(n int) bool {
    if n == 0 {
        return true
    }
    rn := 0
    m := n
    for m != 0 {
        rn = (10 * rn) + (m % 10)
        m = int(m / 10)
    }
    return n == rn
}
