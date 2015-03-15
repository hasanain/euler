lengths = [0]
def pSize(n):
	collatz = 0
	while n != 1:
		collatz+=1
		if n % 2 == 0:
			n /= 2
		else:
			n = 3 * n + 1
		if n < len(lengths):
			collatz += lengths[n]
			break
	if n == 1:
		collatz+=1
	lengths.append(collatz)
	return collatz

def longestCollatzUnder(n):
	longestNumber = 0
	longestChain = 0
	for i in range(1, n-1):
		m = pSize(i)
		if m >= longestChain:
			longestChain = m
			longestNumber = i
	return longestNumber

print longestCollatzUnder(1000000)

