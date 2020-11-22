/*
Project Euler Problem 43
========================

The number, 1406357289, is a 0 to 9 pandigital number because it is made
up of each of the digits 0 to 9 in some order, but it also has a rather
interesting sub-string divisibility property.

Let d[1] be the 1st digit, d[2] be the 2nd digit, and so on. In this
way, we note the following:

  * d[2]d[3]d[4]=406 is divisible by 2
  * d[3]d[4]d[5]=063 is divisible by 3
  * d[4]d[5]d[6]=635 is divisible by 5
  * d[5]d[6]d[7]=357 is divisible by 7
  * d[6]d[7]d[8]=572 is divisible by 11
  * d[7]d[8]d[9]=728 is divisible by 13
  * d[8]d[9]d[10]=289 is divisible by 17

Find the sum of all 0 to 9 pandigital numbers with this property.
*/
 package main

import (
    "fmt"
    "sync"
    "sync/atomic"
)

func isPandigital(n int) bool {
    m := make(map[int]int)
    for n != 0 {
        d := n % 10
        m[d] = m[d] + 1
        n = n / 10
        if m[d] > 1 {
            return false
        }
    }
    return len(m) == 10
}

func exp(m, n int) int {
    if n == 0 {
        return 1
    }
    o := m
    for i := 1; i < n; i++ {
        o = o * m
    }
    return o
}

// assuming length 10 for n
func getSubDigits(n, s int) int {
    f := 10 - (s + 2)
    e := exp(10, f)
    n = n / e
    m := n % 1000
    return m
}


func main() {
    m := map[int]int {
        2: 2,
        3: 3,
        4: 5,
        5: 7,
        6: 11,
        7: 13,
        8: 17,
    }
    var s int64
    var wg sync.WaitGroup
    run := func (i int) {
        defer wg.Done()
        fact := isPandigital(i)
        for s:= 2; s <= 8; s++ {
            if !fact {
                break
            }
            ds := getSubDigits(i, s)
            fact = fact && ds % m[s] == 0
        }
        if fact {
            atomic.AddInt64(&s, int64(i))
        }
    }
    for i:= 1_000_000_000; i < 10_000_000_000; i++ {
        wg.Add(1)
        go run(i)
    }
    wg.Wait()
    fmt.Println(s)
}
