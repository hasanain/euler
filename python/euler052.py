def have_same_digits(n1, n2, n3, n4, n5, n6):
    return sorted(list(str(n1))) == sorted(list(str(n2))) == sorted(list(str(n3))) == sorted(list(str(n4))) == sorted(list(str(n5))) == sorted(list(str(n6)))

for i in range(1,1000000):
    if have_same_digits(i, 2*i, 3*i, 4*i, 5*i, 6*i):
        print(i)
        break
