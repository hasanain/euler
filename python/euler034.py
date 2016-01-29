from math import factorial as f

def fd(n):
    digits = [f(int(x)) for x in str(n)]
    return sum(digits)

print(sum([x for x in range(3,100000) if sum([f(int(y)) for y in str(x)])  == x]))
