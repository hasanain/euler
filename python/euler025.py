def fib(n):
    a, b = 1, 1
    if n <= 0:
        return 0
    if n == 1 or n == 2:
        return 1
    for i in range(n - 2):
        temp = b
        b = a+b
        a = temp
    return b
