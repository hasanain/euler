; Project Euler Problem 4
; =======================
;
; A palindromic number reads the same both ways. The largest palindrome made from the
; product of two 2-digit numbers is 9009 = 91 × 99.

;(define (largest-palindrome-product min max)
;    (define (palindrome? n)
;        (if ((< n 10) #t)))
;)

(define (problem4)
  
  (define (largest-palindrome-product min max)
    
    (define (palindrome? n)
      
      (define (get-digit n d)
        (modulo (quotient n (expt 10 d)) 10))
  
      (define (len n)
        (define (len n d)
          (if (= n 0) d
              (len (quotient n 10) (+ d 1))))
        (if (= n 0) 1
            (len n 0)))
  
      (define (palindrome? i1 i2)
        (cond ((>= i1 i2) #t)
              ((= (get-digit n i1) (get-digit n i2)) (palindrome? (+ i1 1) (- i2 1)))
              (else #f)))
  
      (palindrome? 0 (- (len n) 1)))
  
    (define (inner n1 n2 val)
      (let ((prod (* n1 n2)))
        (cond ((> n2 max) val)
              ((and (> prod val) (palindrome? prod)) (inner n1 (+ n2 1) prod))
              (else (inner n1 (+ n2 1) val)))))
  
    (define (loop curr val)
      (if (>= curr max) val
          (loop (+ curr 1) (inner curr min val))))
    
    (loop min 0 inner))
  
(largest-palindrome-product 100 999))

(problem4)