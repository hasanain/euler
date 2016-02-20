#lang scheme


; Project Euler Problem 1
; =======================
;
; If we list all the natural numbers below 10 that are multiples of 3 or 5,
; we get 3, 5, 6 and 9. The sum of these multiples is 23.
;
; Find the sum of all the multiples of 3 or 5 below 1000.

(define (sum l)
  (cond
    ((null? l) 0)
    (else (+ (car l) (sum (cdr l))))))


(define (threeOrFive? x)
  (or (= (remainder x 3) 0) (= (remainder x 5) 0)))

(define (range n)
  (define (r m)
    (cond
      ((= m (- n 1)) (list m))
      (else (cons m (r (+ m 1))))))
  (r 0))

(define (filter f l)
  (cond
    ((null? l) '())
    ((f (car l)) (cons (car l) (filter f (cdr l))))
    (else (filter f (cdr l)))))
    
(sum (filter threeOrFive? (range 1000)))
