#lang scheme
(define size 2)
(define (abs x)
  (cond ((< x 0) (- x))
        (else x)))


(define (abs-if x)
  (if (< x 0) (- x) x))

(define (largest x y)
  (if (> x y) x y))
(define (cube x) (* x x x))
(define (square x) (* x x))
(define (square-sum-largest-two x y z)
  (cond ((> x y) (+ (square x) (square (largest y z))))
        ((> y x) (+ (square y) (square (largest x z))))
        ((> z x) (+ (square z) (square (largest x y))))
        ))



(define (sqrt x)
  (define (sqrt-inner guess)
    (if (< (abs (- (square guess) x)) 0.001)
        guess
        (sqrt-inner (/ (+ guess (/ x guess)) 2))))
  (sqrt-inner 1.0))



(define (cbrt x)
  (define (cbrt-inner y)
    (if (< (abs (- (cube y) x)) 0.001)
        y
        (cbrt-inner (/ (+ (* y 2) (/ x (square y))) 3))))
  (cbrt-inner 1.0))



(define (factorial n)
  (if (= n 1) 1 (* n (factorial (- n 1)))))

(define (fact n)
  (define (fact-inner result n)
    (if (= n 1) result (fact-inner (* result n) (- n 1))))
  (fact-inner 1 n))


(define (kinds-of-coins n)
  (cond ((= n 1) 1)
        ((= n 2) 5)
        ((= n 3) 10)
        ((= n 4) 25)
        (else 50)))

(define (count-change a n)
  (cond ((= a 0) 1)
        ((or (< a 0) (= n 0)) 0)
        (else (+
               (count-change a (- n 1))
               (count-change (- a (kinds-of-coins n)) n)))))


(define (f n)
  (if (< n 3)
      n
      (+
       (f (- n 1))
       (* 2 (f (- n 2)))
       (* 3 (f (- n 3))))))

(define (g n)
  (if (< n 3)
      n
      (+ (g (- n 1))
         (g (- n 2)))))

(define (gi n)
  (define (inner a b n)
    (if (= 0 (- n 1))
         b
        (inner (+ a b) a (- n 1))))
  (inner 2 1 n))

(define (fi n)
  (define (inner a b c n)
    (if (= 0 n)
        c
        (inner (+ a (* 2 b) (* 3 c)) a b (- n 1))))
  (inner 2 1 0 n))

(define (fii n)
  (define (inner a b c n)
    (if (= n 0)
        c
        (inner (+ a (* b 2) c) a b (- n 1))))
  (inner 2 1 0 n))

(define (pascal r c)
  (cond ((or (< c 0) (< r 0) (> c r)) 0)
        ((or (= c 1) (= c r)) 1)
        (else (+ (pascal (- r 1) (- c 1)) (pascal (- r 1) c)))))



(pascal 5 3)



