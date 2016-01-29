function isPrime(num) {

    if (num === 0 || num === 1)
        return false;
    if (num < 4)
        return true;
    if (num % 2 === 0)
        return false;
    if (num < 9)
        return true;
    if (num % 3 === 0)
        return false;
    else {

        var sqrt = Math.floor(Math.sqrt(num));
        var f = 5;

        while (f <= sqrt) {
            if (num % f == 0)
                return false;
            if (num % (f + 2) == 0)
                return false;
            f += 6;
        }
        return true;
    }
}
module.exports = isPrime;
