from math import sqrt
def pen(n):
    return n*(3*n-1)//2

def ispen(p):
    return (1 + sqrt(1 + 24*p))/6.0 == int((1 + sqrt(1 + 24*p))/6.0)

ll = [pen(x) for x in range(1, 10000)]
flag = False
for i in range(len(ll)):
    for j in range(i, len(ll)):
        if ispen(abs(ll[j] - ll[i])) and ispen(ll[i] + ll[j]):
            print(ll[i], ll[j])
            print(ll[j] - ll[i])
            flag = True
            break
    if flag:
        break
