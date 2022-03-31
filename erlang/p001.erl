-module(p001).
-export([sumM35/0]).

sumM35(0) -> 0;
sumM35(N) when (N rem 3 == 0) or  (N rem 5 == 0) -> N + sumM35(N-1);
sumM35(N) -> 0 + sumM35(N-1).

sumM35() -> sumM35(999).
