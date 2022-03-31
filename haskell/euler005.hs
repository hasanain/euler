-- Project Euler Problem 5
-- =======================
--
-- 2520 is the smallest number that can be divided by each of the numbers
-- from 1 to 10 without any remainder.
--
-- What is the smallest number that is evenly divisible by all of the numbers
-- from 1 to 20?


-- the number should be the product of the higest power of each prime less
-- than 20, that is also less that 20
main = print (19 * 17 * 16 * 13 * 11 * 9 * 7 * 5)
