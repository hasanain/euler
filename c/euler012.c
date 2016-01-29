#include <stdlib.h>
#include <stdio.h>
#include <math.h>

#define TRUE 1

int main(int argc, char **argv){
	int divisors,i, n, currTriangle, o;
	n = currTriangle = 1;
		
	while(TRUE){
		divisors = 0;
		o = (int) floor(sqrt(currTriangle));
	
		for(i = 1; i < o; i++)
			if(currTriangle %i == 0)
				divisors++;
	
		if(divisors >= 250)
			break;

		currTriangle += ++n;
	}
	printf("%d\n", currTriangle);
}
