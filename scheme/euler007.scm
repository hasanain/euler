; By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, 
; we can see that the 6th prime is 13.
;
; What is the 10 001st prime number?


(define (prime? n)
    (define (inner i n)
        (cond ((> i (sqrt n)) #t)
              ((= (remainder n i) 0) #f)
              (else (inner (+ i 1) n))))
   (inner 2 n))


(define (prime-no n)
  (define (inner i v)
    (cond ((= i n) (- v 2))
          ((prime? v) (inner (+ i 1) (+ v 2)))
          (else (inner i (+ v 2)))))
  (inner 1 3))

(prime-no 10001)