from primes import is_prime
from functools import reduce

lim = 1000000
pl = [x for x in range(lim) if is_prime(x)]
sums = {}
longest = [0,0]
done = False
for i in range(len(pl)):
    j = i

    while j <= len(pl):
        s = sum(pl[i:j])
        if is_prime(s) and s > lim:
            done = True
            break
        if is_prime(s):
            if longest[1] < j-i -1:
                longest[1] = j -i -1
                longest[0] = s
        j += 1
#print(reduce(lambda a, b: a if cp[a] > cp[b] else b, cp.keys()))
print(longest)
#print(list(pl[:21]), sum(pl[:21]))
