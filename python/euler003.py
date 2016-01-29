"""
 Project Euler Problem 3
 =======================

 The prime factors of 13195 are 5, 7, 13 and 29.

 What is the largest prime factor of the number 600851475143?
"""
from math import sqrt

def factorize(n):
    gf = 3
    while n % 2 == 0:
        n /=2
    for i in range(1, int(sqrt(n))):
        if n % i == 0  and isPrime(i):
            if i > gf:
                gf = i
            if isPrime(n /i):
                gf = n /i
                break
    return gf

def isPrime(n):
    if n == 1:
        return False
    elif n % 2 == 0 or n % 3==0:
        return False
    else:
        for i in range (5, int(sqrt(n)) + 1, 2):
            if n % i == 0:
                return False
        return True

print factorize(81)
