/*
Project Euler Problem 27
========================

Euler published the remarkable quadratic formula:

                               n^2 + n + 41

It turns out that the formula will produce 40 primes for the consecutive
values n = 0 to 39. However, when n = 40, 40^2 + 40 + 41 = 40(40 + 1) + 41
is divisible by 41, and certainly when n = 41, 41^2 + 41 + 41 is clearly
divisible by 41.

Using computers, the incredible formula  n^2 - 79n + 1601 was discovered,
which produces 80 primes for the consecutive values n = 0 to 79. The
product of the coefficients, 79 and 1601, is 126479.

Considering quadratics of the form:

  n^2 + an + b, where |a| < 1000 and |b| < 1000

                              where |n| is the modulus/absolute value of n
                                               e.g. |11| = 11 and |-4| = 4

Find the product of the coefficients, a and b, for the quadratic
expression that produces the maximum number of primes for consecutive
values of n, starting with n = 0.
*/
package main

import (
	"fmt"
	"math"
    "sync"
)

func IsPrime(n int) bool {
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

func f(a, b, n int) int {
	return (n * n) + (a * n) + b
}

func count_seq(a, b int) int {
	n := 0
	for true {
		r := f(a, b, n)
		if r < 0 || !IsPrime(r) {
			return n
		}
		n += 1
	}
	return n
}

func step2 (a int, maxA, maxB, maxN *int, wg *sync.WaitGroup) {
    defer wg.Done()
	for b := -1000; b <= 1000; b += 1 {
            n := count_seq(a, b)
		    if n > *maxN {
			    *maxN, *maxA, *maxB = n, a, b
		    }
	}
}

func main() {
    var wg sync.WaitGroup
	maxA, maxB, maxN := 0, 0, 0
	for a := -999; a < 1000; a += 1 {
        wg.Add(1)
        go step2(a, &maxA, &maxB, &maxN, &wg)
	}
    wg.Wait()
	fmt.Println(maxA * maxB)
}
