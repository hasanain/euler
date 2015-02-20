/*
Project Euler Problem 97
========================

The first known prime found to exceed one million digits was discovered in
1999, and is a Mersenne prime of the form 2^69725931; it contains exactly
2,098,960 digits. Subsequently other Mersenne primes, of the form 2^p1,
have been found which contain more digits.

However, in 2004 there was found a massive non-Mersenne prime which
contains 2,357,207 digits: 28433 * 2^7830457+1.

Find the last ten digits of this prime number.
*/

#include<stdlib.h>
#include<stdio.h>

int main(int argc, char* argv[]){
	long i, j;
	i = 28433;
	for(j = 1; j <= 7830457; j++){
		i *=2;
		i %= 10000000000;
	}
	i++;
	printf("%ld\n", i);
	return 0;
}
