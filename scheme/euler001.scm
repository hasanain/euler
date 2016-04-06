#lang scheme


; Project Euler Problem 1
; =======================
;
; If we list all the natural numbers below 10 that are multiples of 3 or 5,
; we get 3, 5, 6 and 9. The sum of these multiples is 23.
;
; Find the sum of all the multiples of 3 or 5 below 1000.

(define (sum l)
  (define (inner s l)
    (cond
    ((null? l) s)
    (else (inner (+ s (car l)) (cdr l)))))
  (inner 0 l))

(define (threeOrFive? x)
  (or (= (remainder x 3) 0) (= (remainder x 5) 0)))

(define (range n)
  (define (inner c l)
    (cond
      ((< c 0) l)
      (else (inner (- c 1) (cons c l)))))
  (inner (- n 1) '()))

(define (filter f l)
  (define (inner f l a)
    (cond
      ((null? l) a)
      ((f (car l)) (inner f (cdr l) (cons (car l) a)))
      (else (inner f (cdr l) a))))
  (inner f l '()))
   
(sum (filter2 threeOrFive? (range 1000)))
