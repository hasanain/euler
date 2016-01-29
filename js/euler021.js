/*
Project Euler Problem 21
========================

Let d(n) be defined as the sum of proper divisors of n (numbers less than
n which divide evenly into n).
If d(a) = b and d(b) = a, where a =/= b, then a and b are an amicable pair
and each of a and b are called amicable numbers.

For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22,
44, 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1,
2, 4, 71 and 142; so d(284) = 220.

Evaluate the sum of all the amicable numbers under 10000.
*/
var amicableSum  = 0;

for(var a = 0; a < 10000; a++){
	var b = d(a);
	if(d(b) == a && a!=b){
		amicableSum += a;
	}
	
}
// This comment is to mess up things
print(amicableSum);
print(d(220));
function d(number){
	var sum = 1;
	for(var a = 2; a <= number/2; a++){
		if(number % a == 0){
			sum += a;
		}
	}
	return sum;
}
function print(phrase){
	console.log(phrase);
}
