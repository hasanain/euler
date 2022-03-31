def split(n):
    return [int(x) for x in str(n)]
num = 0

for i in range(1,10000000):
    while True:
        if i == 1:
            break
        if i == 89:
            num += 1
            break
        i = sum([x**2 for x in split(i)])
print(num)
