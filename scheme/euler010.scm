; The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
;
; Find the sum of all the primes below two million.

(define (problem10)
  (define (prime? n)
    (define (prime-inner? i)
      (cond ((> i (sqrt n)) #t)
            ((= (remainder n i) 0) #f)
            (else (prime-inner? (+ i 1)))))
      (prime-inner? 2))
  (define (problem10-inner i s)
    (cond ((> i 2000000) s)
          ((prime? i) (problem10-inner (+ i 1) (+ i s)))
          (else (problem10-inner (+ i 1) s))))
  (problem10-inner 2 0))

(problem10)