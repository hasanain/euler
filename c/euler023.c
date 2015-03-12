/*
Project Euler Problem 23
========================

A perfect number is a number for which the sum of its proper divisors is
exactly equal to the number. For example, the sum of the proper divisors
of 28 would be 1 + 2 + 4 + 7 + 14 = 28, which means that 28 is a perfect
number.

A number whose proper divisors are less than the number is called
deficient and a number whose proper divisors exceed the number is called
abundant.

As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16, the
smallest number that can be written as the sum of two abundant numbers is
24. By mathematical analysis, it can be shown that all integers greater
than 28123 can be written as the sum of two abundant numbers. However,
this upper limit cannot be reduced any further by analysis even though it
is known that the greatest number that cannot be expressed as the sum of
two abundant numbers is less than this limit.

Find the sum of all the positive integers which cannot be written as the
sum of two abundant numbers.
*/

#include<stdlib.h>
#include<stdio.h>

#define TRUE 1
#define FALSE 0
int contains(int a[], int size, int query);
int isAbundant(int num);
int main(int argc, char ** argv){
	int numbers[28123];
	int numbers2[28123];
	int size= 0;
	int size2=0;
	int i, j;
	for(i = 1; i <= 28123; i++){
		if(isAbundant(i) == FALSE){
			numbers[size++] = i;
		}
	}
	long sum = 0;
	int flag = FALSE;
	for(i = 0; i < size; i++){
		for(j = i; j < size; j++){
			if(numbers[i]+numbers[j] >= 28123){
				flag = TRUE;
				break;
			}

			if(!contains(numbers2, size2, numbers[i]+numbers[j])){
				printf("%d\n", numbers[i]+numbers[j]);
				numbers2[size2++] = numbers[i]+numbers[j];
			}
				
		}
		if(flag)
			break;
	}
	for(i = 0; i < 28123; i++){
		if(!contains(numbers2, size2, i)){

			sum+= i;
		}
	}
	printf("%ld\n", sum);
}
int contains(int a[], int size, int query){
	int i;
	for(i = 0; i < size; i++){
		if(a[i] == query){
			return TRUE;
		} 
	}
	return FALSE;
}
int isAbundant(int num){
	int sum , i;
	sum = 1;
	for(i = 2; i <= num/2; i++){
		if(num % i == 0){
			sum+= i;
		}
	}
	if(sum > num){
		return TRUE;
	}else{
		return FALSE;
	}
}
