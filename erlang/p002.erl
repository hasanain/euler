-module(p002).
-export([sumEvenFib/1]).

sumEvenFib(A, _B, S, Limit) when A > Limit -> S;
sumEvenFib(A, B, S, Limit) when A rem 2 == 0 -> sumEvenFib(B, A+B, S+A, Limit);
sumEvenFib(A, B, S, Limit) -> sumEvenFib(B, A+B, S, Limit).

sumEvenFib(Limit) -> sumEvenFib(1, 1, 0, Limit).
