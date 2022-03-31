from functools import reduce

def sumdigits(n, p=1):
    digits = [int(x) for x in str(n)]
    return reduce(lambda x, y: x + y**p, digits, 0)

s = sum([x for x in range(1000000) if sumdigits(x, 5) == x]) - 1

# for i in range(1000000):
#     if sumdigits(i, 5) == i:
#         s += i
#         print(i)
print(s)
