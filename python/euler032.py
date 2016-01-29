def ispan(n1, n2, n3):
    s = str(n1)+str(n2)+str(n3)
    return '0' not in s and len(s) == len(set(s)) == 9

ps = set()

for i in range(1, 100):
    for j in range(i, 10000):
        p = i*j
        if p >= 10000:
            break
        if ispan(i,j, p):
            ps.add(p)
            
print(sum(ps))
