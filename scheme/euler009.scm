; Project Euler Problem 9
; =======================
;
; A Pythagorean triplet is a set of three natural numbers,
; a < b < c, for which,
; 
; a^2 + b^2 = c^2
; For example, 32 + 42 = 9 + 16 = 25 = 52.
; 
; There exists exactly one Pythagorean triplet for which
; a + b + c = 1000.
; Find the product abc.


(define (problem9)
  (define (square? n)
    (let ((sqrtn (sqrt n)))
      (= (floor sqrtn) sqrtn)))

  (define (outer a abc)
    (define (inner b abc)
      (let ((c (sqrt (+ (* a a) (* b b)))))
        (cond ((= b 500) abc)
              ((= (+ a b c) 1000) (* a b c))
              (else (inner (+ b 1) abc)))))
    (cond ((= a 500) abc)
          ((> abc 500) abc)
          (else (outer (+ a 1) (inner (+ a 1) abc)))))

  (outer 1 1))

(problem9)