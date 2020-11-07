"""
Project Euler Problem 26
========================

A unit fraction contains 1 in the numerator. The decimal representation of
the unit fractions with denominators 2 to 10 are given:

   1/2  =  0.5
   1/3  =  0.(3)
   1/4  =  0.25
   1/5  =  0.2
   1/6  =  0.1(6)
   1/7  =  0.(142857)
   1/8  =  0.125
   1/9  =  0.(1)
  1/10  =  0.1

Where 0.1(6) means 0.166666..., and has a 1-digit recurring cycle. It can
be seen that ^1/[7] has a 6-digit recurring cycle.

Find the value of d < 1000 for which ^1/[d] contains the longest recurring
cycle in its decimal fraction part.
"""

def ld(n,m):
    r = n
    res = ''
    decimal = False
    seen = set()
    while r != 0:
        if r < m:
            r = 10 * r
            if res == '':
                res = '0'
            if not decimal:
                res += '.'
                decimal = True
        if r in seen:
            break
        seen.add(r)
        curr_res = r // m
        res += str(curr_res)
        r = r - (curr_res * m)
    else:
        return res, False if res != '0' else ('0', False)
    return res, True if res != '0' else ('0', True)


def main():
   max_seq, max_d = '', 0
   for d in range(2, 1001):
       seq, is_cycle = ld(1,d)
       if is_cycle and len(seq) > len(max_seq):
          max_seq = seq
          max_d = d
   print(max_d)

if __name__ == '__main__':
    main()
