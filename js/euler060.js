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

var isPrime = require('./primes');
var primes = [];

for(let i = 3; i < 10001; i++){
  if(isPrime(i)){
    primes.push(i);
  }
}
//-------------------------------------------------------
//-------------------------------------------------------



var solutions = [];

for(let i = 0; i < primes.length; i++){
  for(let j = i+1; j < primes.length; j++){
    if(checkPrimality([primes[i]], primes[j])){
      solutions.push([primes[i], primes[j]]);
    }
  }
}

sol_fil = solutions.filter(function(el) {
  return checkPrimality(solutions, el);
});
console.log(sol_fil.length, solutions.length);

var solutions3 = []
for(let i = 0; i < solutions.length; i++){
  let s = solutions[i];
  for(let k = i; k < primes.length; k++){
    if(checkPrimality(s, primes[k])){
      let temp = s.slice()
      temp.push(primes[k])
      solutions3.push(temp)
    }
  }
}


var solutions5 = []
loop1: for(let i = 0; i < solutions.length; i++){
  for(let j = 0 ; j < solutions3.length; j++){
    if(checkPrimality(solutions[i], solutions3[j][0])){
      let temp = solutions[i].slice();
      temp.push(solutions3[j][0]);
      if(checkPrimality(temp, solutions3[j][1])){
        temp.push(solutions3[j][1]);
        if(checkPrimality(temp, solutions3[j][2])){
          temp.push(solutions3[j][2]);
          solutions5.push(temp);
          console.log(temp.reduce((x,y) => x+y));
          break loop1;
        }
      }
    }
  }
}

function checkPrimality(list, n){
  for(var i = 0; i < list.length; i++){
    if(!isPrime(parseInt(list[i] + '' + n))){
      return false;
    }
    if(!isPrime(parseInt(n + '' + list[i]))){
      return false;
    }
  }
  return true;
}

