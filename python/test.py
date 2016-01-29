from primes import is_prime
x = True
y = False
z = 0
if z:
    print("x is false")
if x and y or (z and y):
    print("hello")
i = 0
l = [x for x in range(10000) if is_prime(x)]
s = "Hello"
print(s[::-1])

def fib(n):
    if n <= 0:
        return 0
    if n == 1 :
        return 1
    if n == 2:
        return 1
    return fib(n - 1) + fib(n - 2)

print(fib(8-9))
