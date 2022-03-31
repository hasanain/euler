from math import sqrt, ceil
def get_divisors(n):
   #  f = {x for x in range(1, ceil(sqrt(n))) if n % x == 0}
   #  f2 = {n//x for x in f} - {n}
   #  print(n, f | f2)
   #  return f | f2
    return { x for x in range(1, n) if n % x == 0 }
def is_abundant(n):
    return sum(get_divisors(n)) > n

abundants = [i for i in range(1, 28123) if is_abundant(i)]
sums=set()
for i in range(len(abundants)):
    j = i
    while j < len(abundants):
        sums.add(abundants[i] + abundants[j])
        j += 1
print({24} - sums)
print(sum(set(range(1, 28124)) - sums))
