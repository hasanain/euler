def ispalindrom(s):
    for i in range(len(s)):
        if s[i] != s[len(s) -1 - i]:
            return False
    return True

print(sum([x for x in range(1000000) if ispalindrom(str(x)) and ispalindrom(bin(x)[2:])]))
