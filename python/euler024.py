def permute(s, p='', m=1000000):
    n = len(s)
    m = m -1
    if n == 0:
        print(p)
    else:
        for i in range(n):
            permute(s[:i] + s[i+1:n], p + s[i], m)

permute('0123456789')
