from primes import is_prime
from functools import reduce

def iscirc(n):
    if n == 2 or n == 5:
        return True
    digits = [int(x) for x in str(n)]
    for d in digits:
        if d % 2 == 0 or d == 5:
            return False
    perms = []
    for i in range(len(digits)):
        perms.append(reduce(lambda x, y: 10*x + y, digits[i:] + digits[:i]))
    for p in perms:
        if(not is_prime(p)):
            return False
    return True

print(reduce(lambda x, y: x + 1 if iscirc(y) else x, range(1000000)))
