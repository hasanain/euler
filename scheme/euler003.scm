#lang scheme

; Project Euler Problem 3
; =======================
;
; The prime factors of 13195 are 5, 7, 13 and 29.
;
; What is the largest prime factor of the number 600851475143?

(define (gcd a b)
  (cond
    ((= b 0) a )
    (else (gcd b (modulo a b)))))

(define (largest-prime-factor n)
  (define (g x) (modulo (+ (* x x) 1) n))
  (define (inner x y d)
    (cond
      ((<= d 1) (inner (g x) (g (g y)) (gcd (abs (- x y)) n)))
      (else d)))
  (inner 2 2 1))

(largest-prime-factor 600851475143)

(define (e3 n)
  (define (e3-inner num div)
    (if (> num 1)
        (if (= (modulo num div) 0)
            (e3-inner (/ num div) (- div 1))
            (e3-inner num (+ div 1)))
        (+ div 1)))
  (e3-inner n 2))
(e3 600851475143)