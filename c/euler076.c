/*
Project Euler Problem 76
========================

It is possible to write five as a sum in exactly six different ways:

4 + 1
3 + 2
3 + 1 + 1
2 + 2 + 1
2 + 1 + 1 + 1
1 + 1 + 1 + 1 + 1

How many different ways can one hundred be written as a sum of at least
two positive integers?
*/

#include <stdio.h>

int solution(int largest, int lesser){
        if(largest == 0) return 1;
        if(largest < 0) return 0;
        if(lesser <= 0) return 0;
        return solution(largest, lesser - 1) + solution(largest - lesser, lesser);
}

int main(int argc, char ** argv){
        printf("%d\n", solution(100, 99));
        return 0;
}

