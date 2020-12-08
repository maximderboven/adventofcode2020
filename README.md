# adventofcode2020
advent of code 2020
using Java

## Day 1
### part 1
Walk through array and brute force everything until there is one outcome.
### part 2
Same as part 1 but with 3 parameters.

## Day 2
### part 1
Walk through array split on -, " " and :, use that array to check each char in the pwd to check the count afterwards.
### part 2
same as part 1; but use chars on index for condition.

## Day 3
### part 1
loop thru array and check char on position for '#' and count.
### part 2
part 1 + using input values or finals.

## Day 4
### part 1
Split string on empty line and for each check if it contains the required titles
### part 2
using part 1 to split again to get the values separated, and store them in vars to waterfall them thru ifs to check condition and count.

## Day 5
### part 1
looping array with boarding passes : check first 7/last 3 chars and depending on that determine the lower and upper limit until you have the same number in both limits. Storing all results in array and printing the max within the array.
### part 2
running part1 with fori and check which is missing.

## Day 6
### part 1
Splitting on new line and storing in array. Run through and put all unique answers in another array and count the array with size.
### part 2
Get the same unique array and an array with the all the answers and compare them with frequency and a person counter to check how many persons have answered based on the newlines within one group. if one > add all answers as answered

## Day 7
### part 1
Start by parsing data into something useful "color n color": recursive loop through items using parent and child beware that a child can be a parent as well. (tried using Generic Graph with vertexes)
### part 2
using n to get the amount of bags within a bag and multiply by the amount of possibilities.

## Day 8
### part 1
Started by splitting the instructions and making an object & storing them in an array. looping the array, set a flag by used once. Once he enters a flag that means the loop is starting over. counting the acc.
### part 2
rewrited the first code without external class and object. looped until the program terminates. If it didn't: brute force change 'nop' to 'jmp' or 'jmp' to 'nop'.
