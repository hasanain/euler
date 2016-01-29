import java.util.Date;
/*
Project Euler Problem 58
========================

Starting with 1 and spiralling anticlockwise in the following way, a
square spiral with side length 7 is formed.

                           37 36 35 34 33 32 31
                           38 17 16 15 14 13 30
                           39 18  5  4  3 12 29
                           40 19  6  1  2 11 28
                           41 20  7  8  9 10 27
                           42 21 22 23 24 25 26
                           43 44 45 46 47 48 49

It is interesting to note that the odd squares lie along the bottom right
diagonal, but what is more interesting is that 8 out of the 13 numbers
lying along both diagonals are prime; that is, a ratio of 8/13 62%.

If one complete new layer is wrapped around the spiral above, a square
spiral with side length 9 will be formed. If this process is continued,
what is the side length of the square spiral for which the ratio of primes
along both diagonals first falls below 10%?
*/
'use strict';

console.log(findRatio(0.62));
function findRatio(ratio){
  let currentRatio = 1;
  for(let i = 1; i < 1000; i++){
      
}
function isDiagonal
function isPrime(num) {

    if (num == 0 || num == 1)
        return false;
    if (num < 4)
        return true;
    if (num % 2 == 0)
        return false;
    if (num < 9)
        return true;
    if (num % 3 == 0)
        return false;
    else {
        let sqrt =  Math.floor(Math.sqrt(num));
        let f = 5;

        while (f <= sqrt) {
            if (num % f == 0)
                return false;
            if (num % (f + 2) == 0)
                return false;
            f += 6;
        }
        return true;
    }
}

