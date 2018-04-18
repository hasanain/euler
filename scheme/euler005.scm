; Project Euler Problem 5
; =======================
;
; 2520 is the smallest number that can be divided by each of the numbers 
; from 1 to 10 without any remainder.
;
; What is the smallest positive number that is evenly divisible by 
; all of the numbers from 1 to 20?


(define (problem5)
    (* 16 9 5 7 11 13 17 19))
(problem5)

; generally: let N the smallest number that can be divided by each of the numbers
; 1 and n (inclusive), then N = product(a^b) for 1 < a <= n
; where: a is prime
;        b the largest power can be raised to while keeping (a^b) <= n true
