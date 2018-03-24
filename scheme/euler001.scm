; Project Euler Problem 1
; =======================
;
; If we list all the natural numbers below 10 that are multiples of 3 or 5,
; we get 3, 5, 6 and 9. The sum of these multiples is 23.
;
; Find the sum of all the multiples of 3 or 5 below 1000.

(define (problem1)
    (define (sum-multiples-of-3-and-5 n)
      (define(multiple-of-3-or-5? x)
        (or (= (remainder x 3) 0) (= (remainder x 5) 0)))
      (define (inner i s)
        (cond 
          ((>= i n) s)
          ((multiple-of-3-or-5? i) (inner (+ i 1) (+ i s)))
          (else (inner (+ i 1) s))))
      (inner 1 0))
    (sum-multiples-of-3-and-5 1000))
(problem1)