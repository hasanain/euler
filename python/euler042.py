"""
Project Euler Problem 42
========================

The n-th term of the sequence of triangle numbers is given by, t[n] =
1/2n(n+1); so the first ten triangle numbers are:

                 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...

By converting each letter in a word to a number corresponding to its
alphabetical position and adding these values we form a word value. For
example, the word value for SKY is 19 + 11 + 25 = 55 = t[10]. If the word
value is a triangle number then we shall call the word a triangle word.

Using words.txt, a 16K text file containing nearly two-thousand common
English words, how many are triangle words?
"""
import json

def gen_triangle(max_value):
    values = set()
    n = 1
    t = 1
    values.add(t)
    while t <= max_value:
       t = n * (n + 1) / 2
       n += 1
       values.add(t)
    return values
def main():
    with open('words.txt') as words:
        json_words = f'[{words.read()}]'
    words_list = json.loads(json_words)
    mapped_list = []
    for word in words_list:
        mapped_list.append(sum(ord(letter) - ord('A') + 1 for letter in word))
    max_word = max(mapped_list)
    triangles = gen_triangle(max_word)
    c = 0
    for word in mapped_list:
        if word in triangles:
            c += 1
    print(c)

if __name__ == '__main__':
    main()
