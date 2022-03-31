squares = [x**2 for x in range(1001)]

r = 1001**2
s = 1
skip = 2
for i in range(2,r+1):
    if i % skip == 1:
        s += i
    if i % 2 == 1 and i in squares:
        skip +=2

print(s)
    
