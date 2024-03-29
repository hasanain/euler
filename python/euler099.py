"""
Project Euler Problem 99
========================

Comparing two numbers written in index form like 2^11 and 3^7 is not
difficult, as any calculator would confirm that 2^11 = 2048 < 3^7 = 2187.

However, confirming that 632382^518061 > 519432^525806 would be much more
difficult, as both numbers contain over three million digits.

Using base_exp.txt, a 22K text file containing one thousand lines with a
base/exponent pair on each line, determine which line number has the
greatest numerical value.

NOTE: The first two lines in the file represent the numbers in the example
given above.
"""

from math import log
from sys import stdin

numbers = map(lambda w: w.split(','), stdin)
numbers = map(lambda x: (int(x[0]), int(x[1])), numbers)
numbers = list(numbers)

m = max(numbers, key=lambda x: log(x[0]) * x[1])
print(numbers.index(m))
