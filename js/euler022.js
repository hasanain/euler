/*
Project Euler Problem 22
========================

Using names.txt, a 46K text file containing over five-thousand first names,
begin by sorting it into alphabetical order. Then working out the
alphabetical value for each name, multiply this value by its alphabetical
position in the list to obtain a name score.

For example, when the list is sorted into alphabetical order, COLIN, which
is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. So,
COLIN would obtain a score of 938 * 53 = 49714.

What is the total of all the name scores in the file?
*/

var fs = require('fs');

var names = JSON.parse('[' + fs.readFileSync('../p022_names.txt', 'utf8') + ']')

const greatest = names
  .sort()
  .map(name => name.split("").map(character => character.charCodeAt(0)).reduce((sum, value) => sum + value - 65 + 1, 0))
  .reduce((sum, value, idx) => sum + value * (idx + 1), 0)
console.log(greatest);
