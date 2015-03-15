
def powerOf(b , n):
	while n % b == 0:
		n /= b
	return n == 1

def p(n):
	collatz = []	
	while not powerOf(2, n):
		collatz.append(n)
		if n % 2 == 0:
			n /= 2
		else:
			n = 3 * n + 1
	return collatz

print p(13)
print p(6)
print p(454)
print p(113)
