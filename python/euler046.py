from primes import is_prime
lim = 5000
sl = [x**2 for x in range(lim)]
pl = [x for x in range(lim) if is_prime(x)]

def goldbach(n):
    for i in pl:
        if i >= n:
            return False
        for j in sl:
            if j >= n:
                continue
            if i + 2 * j == n:
                print(n, i, j)
                return True
    return False
for i in range(15, lim**2, 2):
    if not is_prime(i):
        if not goldbach(i):
            print(i)
            break

