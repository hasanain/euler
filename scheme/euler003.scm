; Project Euler Problem 3
; =======================
;
; The prime factors of 13195 are 5, 7, 13 and 29.
;
; What is the largest prime factor of the number 600851475143?

(define (problem3)
  (define (largest-prime-factor n)
    (define (inner i n)
      (cond ((= n 1) i)
            ((= (remainder n i) 0) (inner i (/ n i)))
            (else (inner (+ i 1) n)))
      )
    (inner 2 n))
(largest-prime-factor 600851475143))

(problem3)