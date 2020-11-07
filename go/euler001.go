/*
 Project Euler Problem 1
 =======================

 If we list all the natural numbers below 10 that are multiples of 3 or 5,
 we get 3, 5, 6 and 9. The sum of these multiples is 23.

 Find the sum of all the multiples of 3 or 5 below 1000.
*/
package main

import (
	"fmt"
	"sync"
	"sync/atomic"
)

var total int32

func main() {
	var wg sync.WaitGroup
	wg.Add(3)
	go sum(3, 1, &wg)
	go sum(5, 1, &wg)
	go sum(15, -1, &wg)
	wg.Wait()
	fmt.Printf("sum: %v\n", total)
}

func sum(n int, m int, wg *sync.WaitGroup) {
	defer wg.Done()
	for i := n; i < 1000; i += n {
		atomic.AddInt32(&total, int32(i*m))
	}
}
