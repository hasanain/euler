/*
Project Euler Problem 60
========================

The primes 3, 7, 109, and 673, are quite remarkable. By taking any two
primes and concatenating them in any order the result will always be
prime. For example, taking 7 and 109, both 7109 and 1097 are prime. The
sum of these four primes, 792, represents the lowest sum for a set of four
primes with this property.

Find the lowest sum for a set of five primes for which any two primes
concatenate to produce another prime.
*/

'use strict';

var primes = [];

for (let i = 3; i < 10001; i++) {
  if (isPrime(i)) {
    primes.push(i);
  }
}

var solutions = [];

for (let i = 0; i < primes.length; i++) {
  for (let j = i + 1; j < primes.length; j++) {
    if (checkPrimality([primes[i]], primes[j])) {
      solutions.push([primes[i], primes[j]]);
    }
  }
}
console.log(solutions.length);
var solutions3 = [];
for (let i = 0; i < solutions.length; i++) {
  let s = solutions[i];
  for (let k = 0; k < primes.length; k++) {
    if (checkPrimality(s, primes[k])) {
      let temp = s.slice();
      temp.push(primes[k]);
      solutions3.push(temp);
    }
  }
}

console.log(solutions3.length);
var solultions5 = [];
for (let i = 0; i < solutions.length; i++) {
  if (checkPrimality(solutions3[i], solutions[i][0])) {
    if (checkPrimality(solutions3[i], solutions[i][1])) {
      let temp = solutions3[i].concat(solutions);
      solutions5.push(temp);
      console.log(temp);
    }
  }
}
function checkPrimality(list, n) {
  for (var i = 0; i < list.length; i++) {
    if (!isPrime(parseInt(list[i] + '' + n))) {
      return false;
    }
    if (!isPrime(parseInt(n + '' + list[i]))) {
      return false;
    }
  }
  return true;
}

function isPrime(num) {

  if (num === 0 || num === 1) return false;
  if (num < 4) return true;
  if (num % 2 === 0) return false;
  if (num < 9) return true;
  if (num % 3 === 0) return false;else {

    var sqrt = Math.floor(Math.sqrt(num));
    var f = 5;

    while (f <= sqrt) {
      if (num % f == 0) return false;
      if (num % (f + 2) == 0) return false;
      f += 6;
    }
    return true;
  }
}
