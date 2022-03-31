package main

import (
	"math"
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
	r := math.Floor(math.Sqrt(n))
	f := 5
	for f <= r {
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
