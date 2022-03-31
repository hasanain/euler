/*
Project Euler Problem 47
========================

The first two consecutive numbers to have two distinct prime factors are:

14 = 2 * 7
15 = 3 * 5

The first three consecutive numbers to have three distinct prime factors
are:

644 = 2^2 * 7 * 23
645 = 3 * 5 * 43
646 = 2 * 17 * 19.

Find the first four consecutive integers to have four distinct primes
factors. What is the first of these numbers?
*/
package main
import (
    "fmt"
)
func getFactorsMemoized(history map[int]map[int]int) (func(int) map[int]int) {
    return func (n int) map[int]int {
        on := n
        fs := make(map[int]int)
        m := 2
        for n != 1 {
            for n % m == 0 {
                fs[m] += 1
                n = n / m
            }
            m += 1
        }
        history[on] = fs
        return fs
    }
}
func ei(a, b map[int]int) bool{
    for k := range a {
        if _, ok := b[k]; ok {
            return true
        }
    }
    for k := range b {
        if _, ok := b[k]; ok {
            return true
        }
    }
    return false
}

func main() {
    history := make(map[int]map[int]int)
    history[2] = map[int]int{ 2: 1 }
    history[3] = map[int]int{ 3: 1 }
    history[4] = map[int]int{ 2: 2 }
    history[5] = map[int]int{ 5: 1 }
    gf := getFactorsMemoized(history)
    for i := 6; i < 10000000; i += 1 {
        h0 := gf(i)
        h1 := history[i - 1]
        h2 := history[i - 2]
        h3 := history[i - 3]
        if len(h0) == 4 && len(h1) == 4 && len(h2) == 4 && len(h3) == 4 {
            hs := map[int]map[int]int{i: h0,i - 1: h1,i -2: h2, i - 3: h3}
            yes := true
            for h := range hs {
                for k := range hs {
                    if h != k {
                        yes = yes && ei(hs[h], hs[k])
                    }
                    if !yes {
                        break
                    }
                }
                if !yes {
                    break
                }
            }
            if yes {
                fmt.Println(hs)
                break;
            }
        }
    }
}


