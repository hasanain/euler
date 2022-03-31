/*
Project Euler Problem 41
========================

We shall say that an n-digit number is pandigital if it makes use of all
the digits 1 to n exactly once. For example, 2143 is a 4-digit pandigital
and is also prime.

What is the largest n-digit pandigital prime that exists?
*/

package main
import (
    "fmt"
    "math"
    "sync"
    "sync/atomic"
)
func isPandigital(n int) bool {
    l := 0
    m := make(map[int]bool)
    for n != 0 {
        d := n % 10
        if d == 0 {
            return false
        }
        if _, ok := m[d]; ok {
            return false
        }
        l += 1
        m[d] = true
        n = n / 10
    }
    for i := 1; i <= l; i += 1 {
        if _, ok := m[i]; !ok {
            return false
        }
    }
    return true
}

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
func main() {
    var wg sync.WaitGroup
    var max  int64
    run := func(m, n int, wg *sync.WaitGroup) {
        defer wg.Done()
        for i := m; i < n; i += 2{
            if isPrime(i) && isPandigital(i) && int64(i) > max {
                atomic.SwapInt64(&max, int64(i))
            }
        }
    }
    for m := 1; m < 1_000_000_000; m += 1_000_000 {
        wg.Add(1)
        go run(m, m + 1_000_000, &wg)
    }
    wg.Wait()
    fmt.Println(max)
}
