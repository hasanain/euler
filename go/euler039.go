/*
Project Euler Problem 39
========================

If p is the perimeter of a right angle triangle with integral length
sides, {a,b,c}, there are exactly three solutions for p = 120.

                    {20,48,52}, {24,45,51}, {30,40,50}

For which value of p < 1000, is the number of solutions maximised?
*/

package main
import (
    "fmt"
)

func main() {
    ps := make(map[int][][]int)
    for a := 1; a < 1000; a += 1 {
        for b := 1; b < 1000; b += 1 {
            for c := 1; c < 1000; c += 1 {
                p := a + b + c
                if p >= 1000 {
                    break
                }
                if a * a + b * b == c * c {
                    ps[p] = append(ps[p], []int{a,b,c})
                }
            }
        }
    }
    max_p := 0
    max_len := 0
    for p, abc := range ps {
        if len(abc) > max_len {
            max_len = len(abc)
            max_p = p
       }
    }
    fmt.Println(max_p, ps[max_p])

}
