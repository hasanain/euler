; Project Euler Problem 6
; =======================
;
; The sum of the squares of the first ten natural numbers is,
;
;            12 + 22 + ... + 10^2 = 385
; The square of the sum of the first ten natural numbers is,
;
;            (1 + 2 + ... + 10)2 = 552 = 3025
; Hence the difference between the sum of the squares of the 
; first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

; Find the difference between the sum of the squares of the 
; first one hundred natural numbers and the square of the sum.

(define (problem6)
  
  (define (square x) (* x x))
  
  (define (identity x) x)
  
  (define (sum max f)
    (define (inner i s)
      (if (> i max) s
          (inner (+ i 1) (+ s (f i)))))
    (inner 0 0))
  
  (- (square (sum 100 identity)) (sum 100 square)))
(problem6)