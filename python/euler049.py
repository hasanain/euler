from primes import is_prime as prime
p = [x for x in range(1000, 10000) if prime(x) and prime(x + 3330) and prime(x + 2*3330)]

def isperm(n1, n2):
    return sorted(list(str(n1))) == sorted(list(str(n2)))
def isperml(n):
    n1 = sorted(list(str(n[0])))
    for i in n:
        if n1 != sorted(list(str(i))):
            return False
    return True

for i in p:
    if isperml([i, i+3330, i+2*3330]):
        print(str(i) + str(i+3330) + str(i + 2*3330))
