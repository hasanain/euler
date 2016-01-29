/*
Project Euler Problem 14
========================

The following iterative sequence is defined for the set of positive
integers:

n->n/2 (n is even)
n->3n+1 (n is odd)

Using the rule above and starting with 13, we generate the following
sequence:
                  13->40->20->10->5->16->8->4->2->1

It can be seen that this sequence (starting at 13 and finishing at 1)
contains 10 terms. Although it has not been proved yet (Collatz Problem),
it is thought that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?

NOTE: Once the chain starts the terms are allowed to go above one million.
*/
#include <stdlib.h>
#include <stdio.h>

int pSize(long n, int * curLength, int * prevVals){
	int collatz = 0;
	while (n != 1){
		collatz++;
		if (n % 2 == 0){
			n = n/2;
		}else{
			n = 3 * n + 1;
		}
		if(n < *curLength){
			collatz += prevVals[n];
			break;
		}
	}
	if (n == 1){
		collatz++;
	}
	prevVals[(*curLength)++] = collatz;
	return collatz;
}

int main(int argc, const char * argv []){
	int longestNumber, longestChain, i, m;
	longestNumber = longestChain = 0;
	int l = 1;
	int *lengths;
	lengths = malloc(1000001 * sizeof(int));
	lengths[0] = 0;
	for( i = 1; i < 1000000; i++){
		m = pSize(i, &l, lengths);
		if(m >= longestChain){
			longestChain = m;
			longestNumber = i;
		}
	}
	printf("%d\n", longestNumber);
	free(lengths);
	return 0;
}


