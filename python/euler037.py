"""
Project Euler Problem 37
========================

The number 3797 has an interesting property. Being prime itself, it is
possible to continuously remove digits from left to right, and remain
prime at each stage: 3797, 797, 97, and 7. Similarly we can work from
right to left: 3797, 379, 37, and 3.

Find the sum of the only eleven primes that are both truncatable from left
to right and right to left.

NOTE: 2, 3, 5, and 7 are not considered to be truncatable primes.
"""

from primes import is_prime

def check_right(n):
    while n != 0:
        if not is_prime(n):
            return False
        n = n // 10
        
    return True

def check_left(n):
    d = 10
    m = n % d
    while m != n:
        if not is_prime(m):
            return False
        d = d * 10
        m = n % d
    return True


def main():
    t_primes = []
    i = 11
    while len(t_primes) != 11:
        if check_right(i):
            if check_left(i):
                t_primes.append(i)
        i += 2
    print(sum(t_primes))


if __name__ == '__main__':
    main()
