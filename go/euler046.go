/*
Project Euler Problem 46
========================

It was proposed by Christian Goldbach that every odd composite number can
be written as the sum of a prime and twice a square.

9 = 7 + 2 * 1^2
15 = 7 + 2 * 2^2
21 = 3 + 2 * 3^2
25 = 7 + 2 * 3^2
27 = 19 + 2 * 2^2
33 = 31 + 2 * 1^2

It turns out that the conjecture was false.

What is the smallest odd composite that cannot be written as the sum of a
prime and twice a square?
*/
package main
import (
    "fmt"
    "math"
)

func isPrime(n int) bool {
	if n == 0 || n == 1 {
		return false
	}
	if n < 4 {
		return true
	}
	if n%2 == 0 {
		return false
	}
	if n%3 == 0 {
		return false
	}
	r := math.Floor(math.Sqrt(float64(n)))
	f := 5
	for float64(f) <= r {
		if n%f == 0 {
			return false
		}
		if n%(f+2) == 0 {
			return false
		}
		f += 6
	}
	return true

}
func memoizeIsPrime() (func(int) bool) {
    primes := make(map[int]bool)
    return func(n int) bool {
        if v, found := primes[n]; found {
            return v
        }
        v := isPrime(n)
        primes[n] = v
        return v
    }
}
func isSquare(n int) bool {
    sqrt := math.Sqrt(float64(n))
    return math.Floor(sqrt) == sqrt
}
func main() {
    ip := memoizeIsPrime()
    for n := 33; n <= 1000000; n += 2 {
        if ip(n) {
            continue
        }
        canBeWrittenAsSquare := false
        p := 1
        for p = 1; p < n; p += 2 {
            if !ip(p) {
                continue
            }
            m := n - p
            l := m / 2
            if p + m != n {
                continue
            }
            if isSquare(l) {
                canBeWrittenAsSquare = true
                break
            }
        }
        if !canBeWrittenAsSquare {
            fmt.Println(n)
            break
        }
    }
}
